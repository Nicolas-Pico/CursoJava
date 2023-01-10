package diez;

import java.util.Scanner;

/*Ejemplo 02
  Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta el valor
  ingresado de uno en uno.
  Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.*/

public class Ejemplo02NumerosHasta {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int x;
        int n;

        System.out.print("Ingrese un numero positivo: ");
        n = keyboard.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x + " - ");
            x = x + 1;
        }
    }
}