package diez;

import java.util.Scanner;

/*Problema 03
  En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un programa que
  lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos
  cobran más de $300. Además el programa deberá informar el importe que gasta la empresa en sueldos al
  personal.*/

public class Problema03SueldoEmpleados {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int x;
        int n;
        int salaries;
        int cont1;
        int cont2;
        int salaryExpenses;

        x = 1;
        cont1 = 0;
        cont2 = 0;
        salaryExpenses = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        n = keyboard.nextInt();
        while (x <= n) {
            System.out.print("Ingrese el sueldo del empleado: ");
            salaries = keyboard.nextInt();
            if (salaries >= 100 && salaries <= 300) {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }
            salaryExpenses = salaryExpenses + salaries;
            x = x + 1;
        }
        System.out.println("Cantidad de empleados con sueldos ente 100 y 300: " + cont1);
        System.out.println("Cantidad de empleados con sueldos mayores a 300: " + cont2);
        System.out.println("Gasto total en sueldos a los empleados: " + salaryExpenses);
    }
}