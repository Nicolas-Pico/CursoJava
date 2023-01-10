package seis;

import java.util.Scanner;

/*Problema 03
  Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.*/

public class Problema03SumaPromedio {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1, num2,num3, num4, addition, average;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = keyboard.nextInt();
        System.out.print("Ingrese el cuarto numero: ");
        num4 = keyboard.nextInt();
        addition = num1+num2+num3+num4;
        average = addition/4;
        System.out.print("El resultado de la suma es: ");
        System.out.println(addition);
        System.out.print("El resultado del promedio es: ");
        System.out.println(average);
    }
}