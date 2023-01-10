package ocho;

import java.util.Scanner;

/*Problema 04
  Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
  cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó
  correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe
  el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.*/

public class Problema04PostulanteEmpleo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int numQuestions;

        System.out.print("Ingrese el numero de preguntas correctamente contestadas: ");
        numQuestions = keyboard.nextInt();
        if (numQuestions >= 90){
            System.out.println("¡Nivel maximo!");
        } else if (numQuestions >= 75) {
            System.out.println("¡Nivel medio!");
        } else if (numQuestions >= 50) {
            System.out.println("¡Nivel regular!");
        } else {
            System.out.println("¡Fuera de nivel!");
        }
    }
}