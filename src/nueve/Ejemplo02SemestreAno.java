package nueve;

import java.util.Scanner;

/*Ejemplo 02
  Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si corresponde al
  primer trimestre del año (enero, febrero o marzo) Cargar por teclado el valor numérico del día,
  mes y año.
  Ejemplo: dia:10 mes:1 año:2010.*/

public class Ejemplo02SemestreAno {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int day;
        int mounth;
        int year;

        System.out.print("Ingrese el dia: ");
        day = keyboard.nextInt();
        System.out.print("Ingrese el mes: ");
        mounth = keyboard.nextInt();
        System.out.print("Ingrese el ano: ");
        year = keyboard.nextInt();
        if (mounth == 1 || mounth == 2 || mounth == 3) {
            System.out.println("¡Corresponde al primer trimestre del ano!");
        } else {
            System.out.println("¡No corresponde al primer trimestre del ano!");
        }
    }
}