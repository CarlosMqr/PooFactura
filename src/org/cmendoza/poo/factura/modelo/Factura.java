package org.cmendoza.poo.factura.modelo;

import java.util.Date;

public class Factura {
    private int idFactura;
    private static int idFacturaU;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] facturas;
    private int indiceFactura;
    /////////// CONSTRUCTOR ///////////////
    public Factura(String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        idFactura = ++ idFacturaU;
        this.fecha = new Date();
        this.facturas = new ItemFactura[2];
    }
    ////////// GETTER AND SETTER /////////
    public int getIdFactura(){
        return this.idFactura;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public ItemFactura[] getFacturas(){
        return this.facturas;
    }
    public void addItemFactura(ItemFactura factura){
        if (indiceFactura < this.facturas.length){
            this.facturas[indiceFactura++] = factura;
        }
    }
    ///////// MÉTODOS ///////////////////


}
