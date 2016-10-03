/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfx;

import Code.Cliente;
import Code.Empresa;
import Code.Utilidades;
import javax.swing.JOptionPane;

public class NuevoCliente extends javax.swing.JFrame {
    
    Empresa e;
    int cc;

    public NuevoCliente(Empresa e, int cc) {
        initComponents();
        this.e = e;
        this.cc = cc;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.cedula.setText(String.valueOf(cc));
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        crearCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        crearCliente.setText("Crear Cliente");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Empresa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(email)
                    .addComponent(crearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(nombre)
                    .addComponent(cedula)
                    .addComponent(direccion)
                    .addComponent(telefono))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(crearCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        nombre.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void cedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseClicked
        cedula.setText("");
    }//GEN-LAST:event_cedulaMouseClicked

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionMouseClicked
        direccion.setText("");
    }//GEN-LAST:event_direccionMouseClicked

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseClicked
        telefono.setText("");
    }//GEN-LAST:event_telefonoMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteActionPerformed
        if(telefono.getText().length() == 10 && nombre.getText().length() > 3){
            e.agregarCliente(new Cliente(Utilidades.espaciosEntrada(nombre.getText()), Utilidades.espaciosEntrada(direccion.getText()), Utilidades.espaciosEntrada(email.getText()), Utilidades.espaciosEntrada(telefono.getText()), cc));
            new NuevaCompra(e, cc);
            this.dispose();
        }else JOptionPane.showMessageDialog(null, "Telefono invalido debe tener 10 digitos o nombre menor a tres letras");
    }//GEN-LAST:event_crearClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JButton crearCliente;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
