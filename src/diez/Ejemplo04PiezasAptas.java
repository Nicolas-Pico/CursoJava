package diez;

import java.util.Scanner;

/*Ejemplo 04
  Una planta que fabrica perfiles de hierro posee un lote de n piezas.
  Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y luego
  ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud esté comprendida en el rango
  de 1,20 y 1,30 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.*/

public class Ejemplo04PiezasAptas {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;
        int x;
        int amountPieces;
        float pieceLength;

        x = 1;
        amountPieces = 0;

        System.out.print("Ingrese la cantidad de piezas a procesar: ");
        n = keyboard.nextInt();
        while (x <= n) {
            System.out.print("Ingrese el largo de la pieza: ");
            pieceLength = keyboard.nextFloat();
            if (pieceLength >= 1.20 && pieceLength <= 1.30) {
                amountPieces = amountPieces + 1;
            }
            x = x + 1;
        }
        System.out.println("La cantidad de piezas aptas son: " + amountPieces);
    }
}