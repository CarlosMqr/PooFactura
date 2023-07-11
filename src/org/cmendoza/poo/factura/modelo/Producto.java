package org.cmendoza.poo.factura.modelo;

public class Producto {
    private int idProducto;
    private static int idProductoU;
    private String nombre;
    private int precio;

    /////////// CONSTRUCTOR ///////////////
    public Producto(){
        idProducto = ++ idProductoU;
    }
    ////////// GETTER AND SETTER /////////
    public int getIdProducto(){
        return this.idProducto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    //////// MÉTODOS ///////////////////


    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nPrecio: " + precio;
    }
}
