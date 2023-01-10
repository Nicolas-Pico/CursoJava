package nueve;

import java.util.Scanner;

/*Ejemplo 01
  Confeccionar un programa que lea por teclado tres números distintos y nos muestre el mayor.*/

public class Ejemplo01MayorTresNumeros {

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
        if (num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es el: " + num1);
        } else if (num2 > num3) {
            System.out.println("El numero mayor es el: " + num2);
        } else {
            System.out.println("El numero mayor es el: " + num3);
        }
    }
}