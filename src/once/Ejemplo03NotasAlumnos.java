package once;

import java.util.Scanner;

/*Ejemplo 03
  Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales
  a 7 y cuántos menores.*/

public class Ejemplo03NotasAlumnos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int notes;
        int approved = 0;
        int failed = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Ingrese la nota: ");
            notes = keyboard.nextInt();
            if (notes >= 7) {
                approved++;
            } else {
                failed++;
            }
        }
        System.out.println("Cantidad de estudiantes con notas mayores o iguales a 7: " + approved);
        System.out.println("Cantidad de estudiantes con notas menores a 7: " + failed);
    }
}