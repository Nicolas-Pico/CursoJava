package diez;

/*Problema 04
  Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
  (No se ingresan valores por teclado)*/

public class Problema04Serie {

    public static void main(String[] args) {

        int x = 1;
        int terms = 11;

        while (x <= 25) {
            System.out.print(terms + " ,");
            terms = terms + 11;
            x = x + 1;
        }
    }
}