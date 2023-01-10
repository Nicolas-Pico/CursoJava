package ocho;

import java.util.Scanner;

/*Ejemplo 01
  Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio
  e imprima alguno de estos mensajes:
  Si el promedio es >=7 mostrar "Promocionado".
  Si el promedio es >=4 y <7 mostrar "Regular".
  Si el promedio es <4 mostrar "Reprobado".*/

public class Ejemplo01EstadoAlumno {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float average;

        System.out.print("Ingrese la primer nota: ");
        nota1 = keyboard.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = keyboard.nextFloat();
        System.out.print("Ingrese la tercer nota: ");
        nota3 = keyboard.nextFloat();
        average = (nota1 + nota2 + nota3)/3;
        System.out.println("Promedio: " + average);
        if (average >= 7){
            System.out.println("Promocionado ");
        } else if (average >=4) {
            System.out.println("Regular ");
        } else {
            System.out.println("Reprobado ");
        }
    }
}