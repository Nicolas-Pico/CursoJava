package nueve;

import java.util.Scanner;

/*Problema 02
  Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
  imprimir en pantalla la leyenda "Todos los números son menores a diez".*/

public class Problema03NumerosMenoresDiez {

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
        if (num1 < 10 && num2 < 10 && num3 < 10) {
            System.out.println("Todos los números son menores a diez");
        }
    }
}