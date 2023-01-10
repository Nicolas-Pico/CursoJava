package ocho;

import java.util.Scanner;

/*Problema 03
  Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras
  y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el
  número de cifras es mayor.*/

public class Problema03CantidadDigitos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero positivo: ");
        num = keyboard.nextInt();
        if (num < 10){
            System.out.println("El numero tiene una cifra");
        } else if (num < 100) {
            System.out.println("El numero tiene dos cifras");
        } else if (num < 1000) {
            System.out.println("El numero tiene tres cifras");
        } else {
            System.out.println("¡Error en la entrada de datos!");
        }
    }
}