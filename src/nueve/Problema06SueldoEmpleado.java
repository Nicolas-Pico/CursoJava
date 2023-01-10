package nueve;

import java.util.Scanner;

/*Problema 06
  De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un programa que
  lea los datos de entrada e informe:
  a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un
  aumento del 20 %, mostrar el sueldo a pagar.
  b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento
  de 5 %.
  c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

public class Problema06SueldoEmpleado {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int salary;
        int laborOld;

        System.out.print("Ingrese el sueldo: ");
        salary = keyboard.nextInt();
        System.out.print("Ingrese los años trabajados en la empresa: ");
        laborOld = keyboard.nextInt();
        if (salary < 500 && laborOld >= 10) {
            float increase = salary * 0.20f;  //Se le agrega la f para especificar que es tipo float
            float salaryPay = increase + salary;
            System.out.println("El sueldo a pagar es: " + salaryPay);
        } else if (salary < 500 && laborOld < 10) {
            float increase = salary * 0.05f;
            float salaryPay = increase + salary;
            System.out.println("El sueldo a pagar es: " + salaryPay);
        } else {
            System.out.println("El sueldo a pagar es: " + salary);
        }
    }
}