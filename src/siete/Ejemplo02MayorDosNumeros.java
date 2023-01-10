package siete;

import java.util.Scanner;

/*Ejemplo 02
  Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor
  de ellos.*/

public class Ejemplo02MayorDosNumeros {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float num1;
        float num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextFloat();
        if (num1 > num2){
            System.out.print("El numero mayor es el: " + num1);
        } else {
            System.out.print("El numero mayor es el: " + num2);
        }
    }
}