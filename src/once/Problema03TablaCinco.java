package once;

/*Problema 03
  Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)*/

public class Problema03TablaCinco {

    public static void main(String[] args) {

        int tableCinco = 5;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("5 * " + i + " = " + tableCinco);
            tableCinco = tableCinco + 5;
        }
    }
}