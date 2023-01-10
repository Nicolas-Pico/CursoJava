package nueve;

import java.util.Scanner;

/*Problema 05
  Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos
  valores enteros x e y (distintos a cero).
  Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
  (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/

public class Problema05UbicacionCuadrante {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float x;
        float y;

        System.out.print("Ingrese la coordenada en x: ");
        x = keyboard.nextInt();
        System.out.print("Ingrese la coordenada en y: ");
        y = keyboard.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("¡Se encuentra en el primer cuadrante!");
        } else if (x < 0 && y < 0) {
            System.out.println("¡Se encuentra en el tercer cuadrante!");
        } else if (x < 0 && y > 0 ) {
            System.out.println("¡Se encuentra en el segundo cuadrante!");
        } else if (x > 0 && y < 0) {
            System.out.println("¡Se encuentra en el cuarto cuadrante!");
        } else {
            System.out.println("¡Las coordenadas se encuentran en el eje!");
        }
    }
}