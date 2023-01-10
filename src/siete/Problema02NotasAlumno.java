package siete;

import java.util.Scanner;

/*Problema 02
  Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje
  "Promocionado".*/

public class Problema02NotasAlumno {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float num1;
        float num2;
        float num3;
        float average;

        System.out.print("Ingrese la primer nota del alumno: ");
        num1 = keyboard.nextFloat();
        System.out.print("Ingrese la segunda nota del alumno: ");
        num2 = keyboard.nextFloat();
        System.out.print("Ingrese la tercer nota del alumno: ");
        num3 = keyboard.nextFloat();
        average = (num1 + num2 + num3)/3;
        System.out.println("Promedio: " + average);
        if (average >= 7) {
            System.out.println("Usted ha sido promocionado");
        } else {
            System.out.println("Usted ha reprobado");
        }
    }
}