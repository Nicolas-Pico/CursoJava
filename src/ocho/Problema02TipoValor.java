package ocho;

import java.util.Scanner;

/*Problema 02
  Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo,
  nulo o negativo.*/

public class Problema02TipoValor {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero entero: ");
        num = keyboard.nextInt();
        if (num == 0){
            System.out.println("El numero es nulo");
        } else if (num > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}