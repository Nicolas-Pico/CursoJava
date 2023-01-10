package diez;

import java.util.Scanner;

/*Problema 07
  Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores
  fueron pares y cuántos impares.
  Emplear el operador % en la condición de la estructura condicional:*/
  //if (valor%2==0)         Si el if da verdadero luego es par.

public class Problema07ParesImpares {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int pairs = 0;
        int odd = 0;
        int x = 1;
        int n;
        int value;

        System.out.print("¿Cuantos numeros desea ingresar?: ");
        n = keyboard.nextInt();
        while (x <= n) {
            System.out.print("Ingrese un valor entero: ");
            value = keyboard.nextInt();
            if (value % 2 == 0) {
                pairs = pairs + 1;
            } else {
                odd = odd + 1;
            }
            x = x + 1;
        }
        System.out.println("Cantidad de numeros pares: " + pairs);
        System.out.println("Cantidad de numeros impares: " + odd);
    }
}