package cinco;

import java.util.Scanner;

/*Ejemplo 01
  Hallar la superficie de un cuadrado conociendo el valor de un lado.*/

public class Ejemplo01SuperficieCuadrado {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int side;
        int area;

        System.out.print("Ingrese el lado: ");
        side = keyboard.nextInt();
        area = side*side;
        System.out.print("La superficie del cuadrado es: ");
        System.out.println(area);
    }
}