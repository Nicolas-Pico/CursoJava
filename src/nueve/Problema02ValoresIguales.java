package nueve;

import java.util.Scanner;

/*Problema 02
  Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con
  el segundo y a este resultado se lo multiplica por el tercero.*/

public class Problema02ValoresIguales {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = keyboard.nextInt();
        if (num1 == num2 && num1 == num3) {
            int addition = num1 + num2;
            System.out.println("La suma de los dos primeros valores: " + addition);
            int product = addition * num3;
            System.out.println("El producto de la suma de los dos primeros valores por el tercero es: " + product);
        }
    }
}