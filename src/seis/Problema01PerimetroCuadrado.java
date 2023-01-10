package seis;

import java.util.Scanner;

/*Problema 01
  Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
  (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro).*/

public class Problema01PerimetroCuadrado {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int side, perimeter;

        System.out.print("Ingrese el lado del cuadrado: ");
        side = keyboard.nextInt();
        perimeter = side*4;
        System.out.print("El perimetro del cuadrado es: ");
        System.out.println(perimeter);
    }
}