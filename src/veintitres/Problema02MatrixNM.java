package veintitres;

import java.util.Scanner;

/*Problema 02
  Crear una matriz de n * m filas (cargar n y m por teclado)
  Imprimir los cuatro valores que se encuentran en los vértices de la misma (mat[0][0] etc.)*/

public class Problema02MatrixNM {

    Scanner keyboard;
    int[][] matrix;

    public static void main(String[] args) {
        Problema02MatrixNM nm = new Problema02MatrixNM();
        nm.loadData();
        nm.printVertices();
    }

    public void loadData(){
        keyboard = new Scanner(System.in);
        System.out.print("¿Cuantas filas tendra la matriz?: ");
        int rows = keyboard.nextInt();
        System.out.print("¿Cuantas columnas tendra la matriz?: ");
        int columns = keyboard.nextInt();
        matrix = new int[rows][columns];
        for(int f = 0; f < matrix.length; f++){
            for(int c = 0; c < matrix[f].length; c++){
                System.out.print("Ingrese componente: ");
                matrix[f][c] = keyboard.nextInt();
            }
        }
    }

    public void printVertices(){
        System.out.print("Vertice superior izquierdo: ");
        System.out.println(matrix[0][0]);
        // Acá dejaremos la fila en 0 y la columna la recorremos para ver cual es el último elemento
        System.out.print("Vertice superior derecho: ");
        System.out.println(matrix[0][matrix[0].length-1]);
        // Acá la fila la recorremos para ver cual es el ultimo elemento y la columna la dejaremos en 0
        System.out.print("Vertice inferior izquierdo: ");
        System.out.println(matrix[matrix.length-1][0]);
        // Acá la fila la recorremos para ver cual es el ultimo elemento y la columna la recorremos para ver cual es el último elemento
        System.out.print("Vertice inferior derecho: ");
        System.out.println(matrix[matrix.length-1][matrix[0].length-1]);
    }
}