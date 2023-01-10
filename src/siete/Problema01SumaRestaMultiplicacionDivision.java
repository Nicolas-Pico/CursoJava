package siete;

import java.util.Scanner;

/*Problema 01
  Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar
  su suma y diferencia, en caso contrario informar el producto y la división del primero respecto
  al segundo.*/

public class Problema01SumaRestaMultiplicacionDivision {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float num1;
        float num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextFloat();
        if (num1 > num2) {
            float addition;
            float subtraction;
            addition = num1 + num2;
            subtraction = num1 - num2;
            System.out.println("La suma es: " + addition);
            System.out.println("La resta es: " + subtraction);
        } else {
            float product;
            float division;
            product = num1 * num2;
            division = num1 / num2;
            System.out.println("El producto es: " + product);
            System.out.println("La division es: " + division);
        }
    }
}