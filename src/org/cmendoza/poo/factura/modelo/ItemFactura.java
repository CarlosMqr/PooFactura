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
    ///////// MÉTODOS ///////////////////
}
