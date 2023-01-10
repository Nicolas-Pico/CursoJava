package nueve;

import java.util.Scanner;

/*Problema 04
  Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10,
  imprimir en pantalla la leyenda "Alguno de los números es menor a diez".*/

public class Problema04UnNumeroMenorDiez {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Ingrese el primer valor: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = keyboard.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        num3 = keyboard.nextInt();
        if (num1 < 10 || num2 < 10 || num3 < 10) {
            System.out.println("Alguno de los números es menor a diez");
        }
    }
}