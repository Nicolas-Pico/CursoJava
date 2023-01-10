package once;

import java.util.Scanner;

/*Ejemplo 05
  Escribir un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a
  1000.*/

public class Ejemplo05MayoresMil {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;
        int larger = 0;
        int value;

        System.out.print("Cantidad de numeros que se desea ingresar: ");
        n = keyboard.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Ingrese numero: ");
            value = keyboard.nextInt();
            if (value >= 1000) {
                larger++;
            }
        }
        System.out.println("Cantidad de valores mayores o iguales a 1000: " + larger);
        keyboard.close();
    }
}