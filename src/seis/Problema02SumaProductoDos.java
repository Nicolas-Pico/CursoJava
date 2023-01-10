package seis;

import java.util.Scanner;

/*Problema02
  Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros
  y el producto del tercero y el cuarto.*/

public class Problema02SumaProductoDos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3, num4, addition, product;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = keyboard.nextInt();
        System.out.print("Ingrese el cuarto numero: ");
        num4 = keyboard.nextInt();
        addition = num1+num2;
        product = num3*num4;
        System.out.print("La suma de los dos primeros numeros es: ");
        System.out.println(addition);
        System.out.print("El producto de los dos ultimos numeros es: ");
        System.out.println(product);
    }
}