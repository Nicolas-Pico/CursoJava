package diez;

/*Problema 05
  Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc*/

public class Problema05MultiplosOcho {

    public static void main(String[] args) {

        int multiples8;
        multiples8 = 8;
        while (multiples8 <= 500) {
            System.out.print(multiples8 + " ,");
            multiples8 = multiples8 + 8;
        }
    }
}