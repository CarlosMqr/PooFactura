package org.cmendoza.poo.factura.modelo;

public class Producto {
    private int idProducto;
    private static int idProductoU;
    private String nombre;
    private int precio;

    /////////// CONSTRUCTOR ///////////////
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
        idProducto = ++ idProductoU;
    }
    ////////// GETTER AND SETTER /////////
    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    //////// MÉTODOS ///////////////////
}
