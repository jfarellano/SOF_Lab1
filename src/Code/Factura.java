package Code;

public class Factura {
    
    private String[][] items;
    //[Codigo producto][cantidad]
    private String fecha;
    private float total;
    private int cantidad;

    public Factura(String[][] items, String fecha, float total, int cant) {
        this.items = items;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cant;
    }

    
    //Get_Set
    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}