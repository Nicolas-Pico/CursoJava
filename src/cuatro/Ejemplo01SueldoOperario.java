package cuatro;

import java.util.Scanner;

/*Ejemplo 01
  Calcular el sueldo mensual de un operario conociendo la cantidad de horas trabajadas y el pago por hora.*/

public class Ejemplo01SueldoOperario {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int hoursWorked;
        float costHour;
        float salary;

        System.out.print("Ingrese las horas trabajadas: ");
        hoursWorked = keyboard.nextInt();
        System.out.print("Ingrese costo por hora: ");
        costHour = keyboard.nextInt();
        salary = hoursWorked*costHour;
        System.out.print("Sueldo del operario: ");
        System.out.println(salary);
    }
}