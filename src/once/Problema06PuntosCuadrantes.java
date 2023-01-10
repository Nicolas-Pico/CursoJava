package once;

import java.util.Scanner;

/*Problema 06
  Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
  Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
  Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.*/

public class Problema06PuntosCuadrantes {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;
        int x;
        int y;
        int quadrantOne = 0;
        int quadrantTwo = 0;
        int quadrantThree = 0;
        int quadrantFour = 0;

        System.out.print("¿Cuantos puntos del plano cartesiano desea ingresar?: ");
        n = keyboard.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Ingrese la coordenada en x: ");
            x = keyboard.nextInt();
            System.out.print("Ingrese la coordenada en y: ");
            y = keyboard.nextInt();
            if (x > 0 && y > 0) {
                quadrantOne++;
            } else if (x < 0 && y < 0) {
                quadrantThree++;
            } else if (x < 0 && y > 0 ) {
                quadrantTwo++;
            } else if (x > 0 && y < 0) {
                quadrantFour++;
            }
        }
        System.out.println("Cantidad de puntos ingresados en el primer cuadrante: " + quadrantOne);
        System.out.println("Cantidad de puntos ingresados en el segundo cuadrante: " + quadrantTwo);
        System.out.println("Cantidad de puntos ingresados en el tercer cuadrante: " + quadrantThree);
        System.out.println("Cantidad de puntos ingresados en el cuarto cuadrante: " + quadrantFour);
    }
}