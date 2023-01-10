package diez;

import java.util.Scanner;

/*Problema 01
  Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas
  mayores o iguales a 7 y cuántos menores.*/

public class Problema01NotasAlumnos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int x;
        int notes;
        int lowNotes;
        int highNotes;

        x = 1;
        lowNotes = 0;
        highNotes = 0;

        while (x <= 10) {
            System.out.print("Ingrese la nota del alumno: ");
            notes = keyboard.nextInt();
            if (notes >= 7) {
                highNotes = highNotes + 1;
            } else {
                lowNotes = lowNotes + 1;
            }
            x = x + 1;
        }
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + highNotes);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + lowNotes);
    }
}