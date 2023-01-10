package diez;

import java.util.Scanner;

/*Problema 06
  Realizar un programa que permita cargar dos listas de 15 valores cada una. Informar con un mensaje cual
  de las dos listas tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor",
  "Listas iguales")
  Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.*/

public class Problema06Listas {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int addition1 = 0;
        int addition2 = 0;
        int value;
        int x = 1;

        while (x <= 15) {
            System.out.print("Ingrese los valores de la primer lista: ");
            value = keyboard.nextInt();
            addition1 = addition1 + value;
            x = x + 1;
        }
        x = 1; // Se reinicia el contador
        while (x <= 15) {
            System.out.print("Ingrese los valores de la segunda lista: ");
            value = keyboard.nextInt();
            addition2 = addition2 + value;
            x = x + 1;
        }
        if (addition1 > addition2) {
            System.out.println("¡Lista 1 mayor!");
        } else if (addition2 > addition1) {
            System.out.println("¡Lista 2 mayor!");
        } else {
            System.out.println("¡Lista iguales!");
        }
    }
}