package org.cmendoza.poo.factura.modelo;

public class ItemFactura {
    private Producto producto;
    private int cantidad;
    /////////// CONSTRUCTOR ///////////////
    public ItemFactura(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad =cantidad;
    }
    ////////// GETTER AND SETTER /////////
    public Producto getProducto(){
        return this.producto;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(){
        this.cantidad = cantidad;
    }
    ///////// MÉTODOS ///////////////////
    public float calcularImporte(){
            return this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return "producto: " + producto +
                "\ncantidad: " + cantidad;
    }
}
