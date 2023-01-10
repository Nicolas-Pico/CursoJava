package seis;

import java.util.Scanner;

/*Problema 04
  Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
  Mostrar lo que debe abonar el comprador.*/

public class Problema04CostoCompra {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float price;
        float total;
        int amount;

        System.out.print("Ingrese el precio del articulo: ");
        price = keyboard.nextFloat();
        System.out.print("Ingrese la cantidad a llevar: ");
        amount = keyboard.nextInt();
        total = price*amount;
        System.out.print("El total a pagar es: ");
        System.out.println(total);
    }
}