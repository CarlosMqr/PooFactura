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
        this.facturas = new ItemFactura[5];
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
    public float calcularTotal(){
            float total = 0.0f;
        for (ItemFactura it: this.facturas) {
            if (it == null){
                continue;
            }
            total += it.calcularImporte();
        }
        return total;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nID Factura: " + this.getIdFactura());
        sb.append("\nCliente: " + cliente.getNombre());
        sb.append("\nNumero cliente: " + cliente.getNoCuenta());
        sb.append("\nDescripcion: " + this.descripcion);
        sb.append("\nEmicion de Factura: " + this.fecha);
        sb.append("\n#\tNombre\t$\tCant.\tTotal\n");
        for (ItemFactura fp: this.facturas) {
            if (fp == null){
                continue;
            }
            sb.append("\n" + fp.getProducto().getIdProducto());
            sb.append("\t" + fp.getProducto().getNombre());
            sb.append("\t" + fp.getProducto().getPrecio());
            sb.append("\t"+ fp.getCantidad());
            sb.append("\t" + fp.calcularImporte());

        }
        sb.append("\nTotal de la compra: " + calcularTotal());

        return sb.toString();
    }


}
