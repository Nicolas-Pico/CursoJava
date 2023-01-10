package veintitres;

import java.util.Scanner;

/*Ejemplo 02
  Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor elemento
  y la fila y columna donde se almacena.*/

public class Ejemplo02MatrixNM {

    Scanner keyboard;
    int[][] matrix;

    public static void main(String[] args) {
        Ejemplo02MatrixNM mn = new Ejemplo02MatrixNM();
        mn.loadData();
        mn.printMajorElement();
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

    public void printMajorElement(){
        int major = matrix[0][0];
        int rowMajor = 0;
        int columnMajor = 0;
        for(int f = 0; f < matrix.length; f++){
            for(int c = 0; c < matrix[f].length; c++){
                if(matrix[f][c] > major){
                    major = matrix[f][c];
                    rowMajor = f;
                    columnMajor = c;
                }
            }
        }
        System.out.println("Elemento mayor de la matriz es: "+ major);
        System.out.print("Se encuantra en la fila: "+ rowMajor +" y en la columna: "+ columnMajor);
    }
}