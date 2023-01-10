package seis;

import java.util.Scanner;

/*Ejemplo 01
  Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.*/

public class Ejemplo01SumaProducto {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1, num2, addition, product;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();
        addition = num1+num2;
        product = num1*num2;
        System.out.print("La suma es: ");
        System.out.println(addition);
        System.out.print("El producto es: ");
        System.out.println(product);
    }
}