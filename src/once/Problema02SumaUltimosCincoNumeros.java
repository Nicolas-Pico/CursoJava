package once;

import java.util.Scanner;

/*Problema 02
  Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5
  valores ingresados.*/

public class Problema02SumaUltimosCincoNumeros {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int value;
        int addition = 0;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Ingrese numero: ");
            value = keyboard.nextInt();
            if (i > 5) {
                addition = addition + value;
            }
        }
        System.out.println("Suma de los ultimos 5 valores ingresados: " + addition);
    }
}