package diez;

/*Ejemplo 01
  Realizar un programa que imprima en pantalla los números del 1 al 100.*/

public class Ejemplo01NumerosUnoCien {

    public static void main(String[] args) {

        int x;

        x = 1;

        while (x <= 100) {
            System.out.print(x + ", ");
            x = x + 1; // De esta manera se hace un contador;
        }
    }
}