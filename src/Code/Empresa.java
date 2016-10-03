package Code;

import java.io.IOException;
import java.util.ArrayList;

public class Empresa {

    public ArrayList<Cliente> clientes;
    public ArrayList<Producto> inventario;

    public Empresa() {
        this.clientes = new ArrayList<>();
        this.inventario = new ArrayList<>();
    }
    
    public Cliente buscarCliente(int cc){
        for(Cliente c: clientes){
            if(c.getId() == cc){
                return c;
            }
        }
        return null;
    }
    
    public Producto buscarProducto(String n){
        for(Producto p: inventario){
            if(p.getNombre().equals(n)) return p;
        }
        return null;
    }
    
    public void guardar() throws IOException{
        String[] guardado = new String[10000];
        int i = 0;
        for(Cliente c: clientes){
            guardado[i] = c.getNombre(); i++;
            guardado[i] = c.getDireccion(); i++;
            guardado[i] = c.getEmail(); i++;
            guardado[i] = c.getTelefono(); i++;
            guardado[i] = String.valueOf(c.getId()); i++;
            guardado[i] = String.valueOf(c.getPuntos()); i++;
            guardado[i] = String.valueOf(c.getPremio()); i++;
            guardado[i] = String.valueOf(c.getTamano()); i++;
            for(Factura f: c.compras){
                guardado[i] = f.getFecha(); i++;
                guardado[i] = String.valueOf(f.getTotal()); i++;
                guardado[i] = String.valueOf(f.getCantidad()); i++;
                for(int j = 0; j < f.getCantidad(); j++){
                    guardado[i] = f.getItems()[j][0]; i++;
                    guardado[i] = f.getItems()[j][1]; i++;
                }
            }
        }
        Utilidades.escribirArchivo(guardado, i, "Cliente.txt");
        String[] productos = new String[1000];
        i = 0;
        for(Producto p: inventario){
            productos[i] = p.getNombre(); i++;
            productos[i] = String.valueOf(p.getPrecio()); i++;
        }
        Utilidades.escribirArchivo(productos, i, "Inventario.txt");
    }
    
    public void load(){
        String s = Utilidades.loadFileAsString("Cliente.txt");
        String[] clt = s.split("\\s+");
        int i = 0;
        while( i < clt.length){
            String nombre, direccion, mail, telefono;
            int puntos, id, premio;
            nombre = clt[i]; i++;
            direccion = clt[i]; i++;
            mail = clt[i]; i++;
            telefono = clt[i]; i++;
            id = Integer.parseInt(clt[i]); i++;
            puntos = Integer.parseInt(clt[i]); i++;
            premio = Integer.parseInt(clt[i]); i++;
            Cliente c = new Cliente(nombre, direccion, mail,telefono, id);
            c.setPuntos(puntos);
            c.setPremio(premio);
            int tamano = Integer.parseInt(clt[i]); i++;
            for(int j = 0; j < tamano; j++){
                String fecha = clt[i] + " " + clt[i + 1]; i++; i++;
                float total = Float.parseFloat(clt[i]); i++;
                int cantidad = Integer.parseInt(clt[i]); i++;
                String[][] items = new String[cantidad][2];
                for(int k = 0; k < cantidad; k++){
                    items[k][0] = clt[i]; i++;
                    items[k][1] = clt[i]; i++;
                }
                c.agregarCompra(new Factura(items, fecha, total, cantidad));
            }
            agregarCliente(c);
        }
        s = Utilidades.loadFileAsString("Inventario.txt");
        clt = s.split("\\s+");
        i = 0;
        while(i < clt.length){
            String nombre = clt[i]; i++;
            float precio = Float.parseFloat(clt[i]); i++;
            agregarProducto(new Producto(nombre, precio));
        }
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void eliminarCliente(Cliente c) {
        clientes.remove(c);
    }

    public void agregarProducto(Producto p) {
        inventario.add(p);
    }

    public void eliminarProducto(Producto p) {
        inventario.remove(p);
    }
}
