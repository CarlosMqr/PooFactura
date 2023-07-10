package org.cmendoza.poo.factura.modelo;

import java.util.Date;

public class Factura {
    private int idFactura;
    private static int idFacturaU;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] facturas;
    /////////// CONSTRUCTOR ///////////////
    public Factura(String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        idFactura = ++ idFacturaU;
        this.fecha = new Date();
        this.facturas = new ItemFactura[2];
    }
    ////////// GETTER AND SETTER /////////
    ///////// MÉTODOS ///////////////////

}
