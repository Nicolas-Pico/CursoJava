package nueve;

import java.util.Scanner;

/*Problema 07
  Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule e informe
  su rango de variación (debe mostrar el mayor y el menor de ellos)*/

public class Problema07RangoValores {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = keyboard.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.print(num1);
        } else if (num2 < num3) {
            System.out.print(num2);
        } else {
            System.out.print(num3);
        }
        System.out.print(" - ");
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}