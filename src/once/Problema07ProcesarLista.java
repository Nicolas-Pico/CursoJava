package once;

import java.util.Scanner;

/*Problema 07
  Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
  a) La cantidad de valores ingresados negativos.
  b) La cantidad de valores ingresados positivos.
  c) La cantidad de múltiplos de 15.
  d) El valor acumulado de los números ingresados que son pares.*/

public class Problema07ProcesarLista {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int values;
        int negatives = 0;
        int positives = 0;
        int mul15 = 0;
        int addPeers = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Ingrese un valor entero: ");
            values = keyboard.nextInt();
            if (values > 0) {
                positives++;
            } else {
                negatives++;
            }
            if (values % 15 == 0) {
                mul15++;
            }
            if (values % 2 == 0) {
                addPeers = addPeers + values;
            }
        }
        System.out.println("Cantidad de valores negativos ingresados: " + negatives);
        System.out.println("Cantidad de valores positivos ingresados: " + positives);
        System.out.println("Cantidad de valores multiplos de 15 ingresados: " + mul15);
        System.out.println("La suma de todos los valores pares: " + addPeers);
    }
}