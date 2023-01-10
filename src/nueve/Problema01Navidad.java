package nueve;

import java.util.Scanner;

/*Problema 01
  Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha
  corresponde a Navidad.*/

public class Problema01Navidad {

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
        if (day == 25 && mounth == 12) {
            System.out.println("¡Es navidad!");
        } else {
            System.out.println("¡No es navidad!");
        }
    }
}