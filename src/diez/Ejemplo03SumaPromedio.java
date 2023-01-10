package diez;

import java.util.Scanner;

/*Ejemplo 03
  Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente
  la suma de los valores ingresados y su promedio.*/

public class Ejemplo03SumaPromedio {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int x;
        int num;
        int addition;
        float average;

        x = 1;
        addition = 0;
        while (x <= 10) {
            System.out.print("Ingrese un numero entero: ");
            num = keyboard.nextInt();
            addition = num + addition;
            x = x + 1;
        }
        average = (float) addition / 10;
        System.out.println("La suma de los 10 valores es: " + addition);
        System.out.println("El promedio es: " + average);
    }
}