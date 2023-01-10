package diez;

import java.util.Scanner;

/*Problema 02
  Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de
  las personas.*/

public class Problema02AlturaPromedio {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int x;
        int n;
        float height;
        float addition;
        float average;

        x = 1;
        addition = 0;


        System.out.print("Ingrese la cantidad de alturas a procesar: ");
        n = keyboard.nextInt();
        while (x <= n) {
            System.out.print("Ingrese la altura: ");
            height = keyboard.nextFloat();
            addition = addition + height;
            x = x + 1;
        }
        average = addition / n;
        System.out.println("La altura promedio de las personas son: " + average);
    }
}