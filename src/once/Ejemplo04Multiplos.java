package once;

import java.util.Scanner;

/*Ejemplo 04
  Escribir un programa que lea 10 números enteros y luego muestre cuántos valores ingresados fueron
  múltiplos de 3 y cuántos de 5. Debemos tener en cuenta que hay números que son múltiplos de 3 y de 5
  a la vez.*/

public class Ejemplo04Multiplos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int mul3 = 0;
        int mul5 = 0;
        int value;

        for (int i = 1; i <=10 ; i++) {
            System.out.print("Ingrese el valor: ");
            value = keyboard.nextInt();
            if (value % 3 == 0) {
                mul3++;
            }
            if (value % 5 == 0) {
                mul5++;
            }
        }
        System.out.println("Cantidad de multiplos de 3: " + mul3);
        System.out.println("Cantidad de multiplos de 5: " + mul5);
    }
}