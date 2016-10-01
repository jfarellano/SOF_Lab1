package Code;

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

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void eliminarCliente(Cliente c) {
        clientes.remove(c);
    }
    
    public void editarCliente(Cliente c) {
        
    }

    public void agregarProducto(Producto p) {
        inventario.remove(p);
    }

    public void eliminarProducto(Producto p) {
        inventario.remove(p);
    }

    public void editarProducto() {

    }
}
