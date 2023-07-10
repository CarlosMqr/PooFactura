package org.cmendoza.poo.factura.modelo;

public class Cliente {
    private String nombre;
    private int noCuenta;

    /////////// CONSTRUCTOR ///////////////
    public Cliente(int noCuenta , String nombre){
        this.noCuenta = noCuenta;
        this.nombre = nombre;
    }
    ////////// GETTER AND SETTER /////////
    public String getNombre(){
        return this.nombre;
    }
    public int getNoCuenta(){
        return this.noCuenta;
    }
    public void setNoCuenta(int noCuenta){
        this.noCuenta = noCuenta;
    }
    ///////// MÉTODOS ///////////////////
}
