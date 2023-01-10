package once;

import java.util.Scanner;

/*Problema 04
  Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de
  multiplicar del mismo (los primeros 12 términos)
  Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.*/

public class Problema04TablaMultiplicar {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un numero del 1 al 10: ");
        n = keyboard.nextInt();
        if (n >= 1 && n <= 10) {
            for (int i = 1; i <= 12 ; i++) {
                int table = i * n;
                System.out.println(n + " * " + i + " = " + table);
            }
        } else {
            System.out.println("¡El numero debe estar entre 1 y 10!");
        }
    }
}