package gfx;

import Code.Cliente;
import Code.Empresa;
import Code.Producto;
import Code.Utilidades;
import javax.swing.table.DefaultTableModel;

public class ListadoClientes extends javax.swing.JFrame {
    
    Empresa e;
    int estado;

    public ListadoClientes(Empresa e) {
        initComponents();
        this.estado = 0;
        this.e = e;
        clear();
        cargarTabla();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    private void cargarTabla(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String[] row = new String[6];
        for(Cliente c: e.clientes){
            row[0] = Utilidades.espaciosSalida(c.getNombre());
            row[1] = String.valueOf(c.getId());
            row[2] = Utilidades.espaciosSalida(c.getDireccion());
            row[3] = Utilidades.espaciosSalida(c.getEmail());
            row[4] = Utilidades.espaciosSalida(c.getTelefono());
            row[5] = String.valueOf(c.getPuntos());
            if(estado == 0){
                model.addRow(row);
            }
            if(estado == 1 && (c.getPuntos() > 100000 || c.getPremio() == 1)){
                c.setPremio(1);
                model.addRow(row);
            }
            if(estado == 2 && c.getTotal() > 1000000){
                model.addRow(row);
            }
        }
    }
    
    private void clear(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        cedula1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        direccion1 = new javax.swing.JTextField();
        telefono1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();

        direccion.setText("Direccion");
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionMouseClicked(evt);
            }
        });

        telefono.setText("Telefono");
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonoMouseClicked(evt);
            }
        });

        email.setText("E-Mail");
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        nombre.setText("Nombre");
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });

        cedula.setText("Cedula");
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedulaMouseClicked(evt);
            }
        });

        cedula1.setText("Cedula");
        cedula1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedula1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "CC", "Direccion", "E-Mail", "Telefono", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar Compras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Elegibles para promo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mas de 1M");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtros");

        direccion1.setText("Direccion");
        direccion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccion1MouseClicked(evt);
            }
        });
        direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion1ActionPerformed(evt);
            }
        });

        telefono1.setText("Telefono");
        telefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefono1MouseClicked(evt);
            }
        });

        email1.setText("E-Mail");
        email1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email1MouseClicked(evt);
            }
        });

        nombre1.setText("Nombre");
        nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(2, 2, 2)
                        .addComponent(eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(334, 334, 334)
                        .addComponent(regresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int[] selectedRows = jTable1.getSelectedRows();
        if (selectedRows.length > 0) {
            for (int j = selectedRows.length - 1; j >= 0; j--) {
                model.removeRow(selectedRows[j]);
                e.eliminarCliente(e.clientes.get(selectedRows[j]));
            }
        }
        clear();
        cargarTabla();
    }//GEN-LAST:event_eliminarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        new MainMenu(e);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        new FacturasCliente(e, e.clientes.get(jTable1.getSelectedRow()));
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        estado = 0;
        clear();
        cargarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        estado = 1;
        clear();
        cargarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        estado = 2;
        clear();
        cargarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMouseClicked
        direccion.setText("");
    }//GEN-LAST:event_direccionMouseClicked

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseClicked
        telefono.setText("");
    }//GEN-LAST:event_telefonoMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        nombre.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseClicked
        cedula.setText("");
    }//GEN-LAST:event_cedulaMouseClicked

    private void direccion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccion1MouseClicked
        direccion.setText("");
    }//GEN-LAST:event_direccion1MouseClicked

    private void telefono1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono1MouseClicked
        telefono.setText("");
    }//GEN-LAST:event_telefono1MouseClicked

    private void email1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email1MouseClicked
        email.setText("");
    }//GEN-LAST:event_email1MouseClicked

    private void nombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre1MouseClicked
        nombre.setText("");
    }//GEN-LAST:event_nombre1MouseClicked

    private void cedula1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedula1MouseClicked
        cedula.setText("");
    }//GEN-LAST:event_cedula1MouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Cliente c = e.clientes.get(jTable1.getSelectedRow());
        if(!direccion1.getText().equals("Direccion") && !direccion1.getText().equals(""))c.setDireccion(Utilidades.espaciosEntrada(direccion1.getText()));
        if(!email1.getText().equals("E-Mail") && !email1.getText().equals("")) c.setEmail(Utilidades.espaciosEntrada(email1.getText()));
        if((!nombre1.getText().equals("Nombre") && !Utilidades.letras(nombre1.getText())) && nombre1.getText().length() > 3)c.setNombre(Utilidades.espaciosEntrada(nombre1.getText()));
        if(!telefono1.getText().equals("Telefono") && telefono1.getText().length() == 10 && Utilidades.numeros(telefono1.getText()))c.setTelefono(Utilidades.espaciosEntrada(telefono1.getText()));
        clear();
        cargarTabla();
    }//GEN-LAST:event_modificarActionPerformed

    private void direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cedula1;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccion1;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono1;
    // End of variables declaration//GEN-END:variables
}
