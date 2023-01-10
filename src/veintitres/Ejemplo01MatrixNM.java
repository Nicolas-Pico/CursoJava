package veintitres;

import java.util.Scanner;

/*Ejemplo 01
  Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.*/

public class Ejemplo01MatrixNM {

    Scanner keyboard;
    int[][] matrix;

    public static void main(String[] args) {
        Ejemplo01MatrixNM nm = new Ejemplo01MatrixNM();
        nm.loadData();
        nm.printMatrix();
        nm.printLastRow();
    }

    public void loadData(){
        keyboard = new Scanner(System.in);
        System.out.print("¿Cuantas filas tendra la matriz?: ");
        int rows = keyboard.nextInt();
        System.out.print("¿Cuantas columnas tendra la matrix?: ");
        int columns = keyboard.nextInt();
        matrix = new int[rows][columns];
        for(int f = 0; f < matrix.length; f++){
            for(int c = 0; c < matrix[f].length; c++){
                System.out.print("Ingrese las componentes: ");
                matrix[f][c]=keyboard.nextInt();
            }
        }
    }

    public void printMatrix(){
        for(int f = 0; f < matrix.length; f++){
            for(int c = 0; c < matrix[f].length; c++){
                System.out.print(matrix[f][c]+" ");
            }
            System.out.println();
        }
    }

    public void printLastRow(){
        System.out.print("Última fila: ");
        for (int c = 0; c < matrix[matrix.length-1].length; c++){
            System.out.print(matrix[matrix.length-1][c]+" ");
        }
    }
}