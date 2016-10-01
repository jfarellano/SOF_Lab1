package Code;

import java.util.ArrayList;

public class Cliente {
    private String nombre, direccion, email, telefono;
    private ArrayList<Factura> compras;
    private int puntos,  id;

    public Cliente(String nombre, String direccion, String email, String telefono, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.id = id;
        this.puntos = 0;
        this.compras = new ArrayList<>();
    }

    public void agregarCompra(Factura f){
        compras.add(f);
    }
    public void eliminarCompra(Factura f){
        compras.remove(f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getCompras() {
        return compras;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}