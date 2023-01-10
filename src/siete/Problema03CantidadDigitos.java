package siete;

import java.util.Scanner;

/*Problema 03
  Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando
  si el número tiene uno o dos dígitos.*/

public class Problema03CantidadDigitos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero positivo entre 1 y 99: ");
        num = keyboard.nextInt();
        if (num >= 10){
            System.out.println("El numero tiene dos cifras");
        } else {
            System.out.println("El numero tiene una cifra");
        }
    }
}