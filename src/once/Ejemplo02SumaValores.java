package once;

import java.util.Scanner;

/*Ejemplo 02
  Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la
  suma de los valores ingresados y su promedio. Este problema ya lo desarrollamos , lo resolveremos
  empleando la estructura for.*/

public class Ejemplo02SumaValores {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int value;
        int addition = 0;
        float average;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un numero entero: ");
            value = keyboard.nextInt();
            addition = addition + value;
        }
        average = addition / 10f;
        System.out.println("La suma de los 10 valores es: " + addition);
        System.out.println("El promedio de los 10 valores es: " + average);
    }
}