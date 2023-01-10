package once;

/*Ejemplo 01
  Realizar un programa que imprima en pantalla los números del 1 al 100.*/

public class Ejemplo01NumerosCien {

    public static void main(String[] args) {

        // Ciclo for
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // Ciclo while
        int x = 1;
        while (x <= 100) {
            System.out.print(x + ", ");
            x++;
        }

        System.out.println();

        // Ciclo do while
        int y = 1;
        do {
            System.out.print(y + ", ");
            y++;
        } while (y <= 100);
    }
}