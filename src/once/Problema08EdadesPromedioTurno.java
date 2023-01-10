package once;

import java.util.Scanner;

/*Problema 08
  Se cuenta con la siguiente información:
  Las edades de 50 estudiantes del turno mañana.
  Las edades de 60 estudiantes del turno tarde.
  Las edades de 110 estudiantes del turno noche.
  Las edades de cada estudiante deben ingresarse por teclado.
  a) Obtener el promedio de las edades de cada turno (tres promedios)
  b) Imprimir dichos promedios (promedio de cada turno)
  c) Mostrar por pantalla un mensaje que indique cual de los tres turnos tiene un promedio de edades menor.*/

public class Problema08EdadesPromedioTurno {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int ages;
        int morning = 0;

        System.out.println("¡Edades del turno de la mañana!");
        for (int i = 1; i <= 50; i++) {
            System.out.print("Ingrese edad: ");
            ages = keyboard.nextInt();
            morning = morning + ages;
        }

        int afternoon = 0;

        System.out.println("¡Edades del turno de la tarde!");
        for (int i = 1; i <= 60; i++) {
            System.out.print("Ingrese edad: ");
            ages = keyboard.nextInt();
            afternoon = afternoon + ages;
        }

        int evening = 0;

        System.out.println("¡Edades del turno de la noche!");
        for (int i = 1; i <= 110; i++) {
            System.out.print("Ingrese edad: ");
            ages = keyboard.nextInt();
            evening = evening + ages;
        }

        float average1 = morning / 50f;
        System.out.println("Promedio de edades del turno de la mañana: " + average1);
        float average2 = afternoon / 60f;
        System.out.println("Promedio de edades del turno de la tarde: " + average2);
        float average3 = evening / 110f;
        System.out.println("Promedio de edades del turno de la noche: " + average3);

        if (average1 < average2 && average1 < average3) {
            System.out.println("¡Turno de la mañana con menor promedio!");
        } else if (average2 < average3) {
            System.out.println("¡Turno de la tarde con menor promedio!");
        } else {
            System.out.println("¡Turno de la noche con menor promedio!");
        }
    }
}