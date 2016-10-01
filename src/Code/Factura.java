package Code;

public class Factura {
    private String[][] items;
    //[Codigo producto][cantidad]
    private String fecha;

    public Factura(String[][] items, String fecha) {
        this.items = items;
        this.fecha = fecha;
    }

    
    //Get_Set
    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }
}