package ocho;

import java.util.Scanner;

/*Problema 01
  Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.*/

public class Problema01MayorTresValores {

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
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("El numero mayor es: " + num1);
            } else {
                System.out.println("El numero mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("El numero mayor es: " + num3);
        }
    }
}