package once;

import java.util.Scanner;

/*Problema 01
  Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la
  base y la altura de un triángulo. El programa deberá informar:
    a) De cada triángulo la medida de su base, su altura y su superficie.
    b) La cantidad de triángulos cuya superficie es mayor a 12.*/

public class Problema01Triangulos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int base;
        int height;
        int n;
        float area;
        int amount = 0;

        System.out.print("Cantidad de triangulos: ");
        n = keyboard.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Ingrese la base: ");
            base = keyboard.nextInt();
            System.out.print("Ingrese la altura: ");
            height = keyboard.nextInt();
            area = (base * height) / 2f;
            System.out.println("Area: " + area);
            if (area > 12) {
                amount++;
            }
        }
        System.out.println("Cantidad de triangulos con superficie mayor a 12: " + amount);
    }
}