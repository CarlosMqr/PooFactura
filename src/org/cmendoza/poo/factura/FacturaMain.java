package org.cmendoza.poo.factura;

import org.cmendoza.poo.factura.modelo.Cliente;
import org.cmendoza.poo.factura.modelo.Factura;
import org.cmendoza.poo.factura.modelo.ItemFactura;
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

        for (int i =0; i < 5; i++){
        producto = new Producto();
            System.out.println("nombre del producto" + producto.getIdProducto() + ": ");
            nombrePrd = s.nextLine();
            producto.setNombre(nombrePrd);

            System.out.println("Precio: ");
            precio = s.nextFloat();

            System.out.println("cantidad: ");
            cantidad = s.nextInt();

            ItemFactura f = new ItemFactura(producto,cantidad);//constructor de la clase ItemFactura
            facCarlos.addItemFactura(f);//metodo de la clase factura
            System.out.println();
        }
        System.out.println(facCarlos.verDetalle());



    }
}
