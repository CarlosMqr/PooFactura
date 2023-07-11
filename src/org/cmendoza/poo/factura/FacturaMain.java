package org.cmendoza.poo.factura;

import org.cmendoza.poo.factura.modelo.Cliente;
import org.cmendoza.poo.factura.modelo.Factura;
import org.cmendoza.poo.factura.modelo.Producto;

import java.util.Scanner;

public class FacturaMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Cliente carlos = new Cliente(1425581,"Carlos");
        Factura facCarlos = new Factura("pc",carlos);

        Producto producto;
        String nombrePrd;
        float precio;
        int cantidad;





    }
}
