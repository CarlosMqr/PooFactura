package org.cmendoza.poo.factura.modelo;

public class Producto {
    private int idProducto;
    private static int idProductoU;
    private String nombre;
    private float precio;

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

    public float getPrecio() {
        return this.precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    //////// MÉTODOS ///////////////////


    @Override
    public String toString() {
        return idProducto + "\t" + nombre +
                "\t" + precio;
    }
}
