package siete;

import java.util.Scanner;

/*Ejemplo 01
  Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla
  indicando que debe abonar impuestos.*/

public class Ejemplo01PagaImpuestos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float salaries;

        System.out.println("Ingrese el sueldo: ");
        salaries = keyboard.nextFloat();
        if (salaries > 3000) {
            System.out.println("Esta persona debe abonar impuestos");
        }
    }
}