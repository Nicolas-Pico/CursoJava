package veintitres;

import java.util.Scanner;

/*Problema 01
  Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segunda.
  Imprimir luego la matriz.*/

public class Problema01MatrixNM {

    Scanner keyboard;
    int[][] matrix;

    public static void main(String[] args) {
        Problema01MatrixNM nm = new Problema01MatrixNM();
        nm.loadData();
        nm.printMatrix();
        nm.swapRows();
        nm.printMatrix();
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

    public void swapRows(){
        // Para cambiar de orden la filas se tienen que modificar las columnas
        for(int c = 0; c < matrix[0].length; c++){
            // Se usa el metodo de la burbuja
            int aux = matrix[0][c];
            matrix[0][c] = matrix[1][c];
            matrix[1][c] = aux;
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
}