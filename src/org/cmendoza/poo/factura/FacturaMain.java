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
        System.out.print("ingresa la cantidad de productos comprados:");
        int cp = s.nextInt();

        for (int i =0; i < cp; i++){
        producto = new Producto();
            System.out.print("nombre del producto" + producto.getIdProducto() + ": ");
            nombrePrd = s.next();
            producto.setNombre(nombrePrd);

            System.out.print("Precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("cantidad: ");
            cantidad = s.nextInt();

            ItemFactura f = new ItemFactura(producto,cantidad);//constructor de la clase ItemFactura
            facCarlos.addItemFactura(f);//metodo de la clase factura
            System.out.println();
        }
        System.out.println(facCarlos.verDetalle());



    }
}
