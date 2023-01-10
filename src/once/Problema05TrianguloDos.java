package once;

import java.util.Scanner;

/*Problema 05
  Realizar un programa que lea los lados de n triángulos, e informar:
    a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles
    (dos lados iguales), o escaleno (ningún lado igual)
    b) Cantidad de triángulos de cada tipo.
    c) Tipo de triángulo que posee menor cantidad.*/

public class Problema05TrianguloDos {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n;
        int sideOne;
        int sideTwo;
        int sideThree;
        int equilateral = 0;
        int isosceles = 0;
        int scalene = 0;

        System.out.print("Ingrese la cantidad de triangulos: ");
        n = keyboard.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Ingrese el valor del primer lado: ");
            sideOne = keyboard.nextInt();
            System.out.print("Ingrese el valor del segundo lado: ");
            sideTwo = keyboard.nextInt();
            System.out.print("Ingrese el valor del tercer lado: ");
            sideThree = keyboard.nextInt();
            if (sideOne == sideTwo && sideOne == sideThree) {
                System.out.println("¡Triangulo equilatero!");
                equilateral++;
            } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
                System.out.println("¡Triangulo isosceles!");
                isosceles++;
            } else {
                System.out.println("¡Triangulo escaleno!");
                scalene++;
            }
        }
        System.out.println("Cantidad de triangulos equilateros ingresados: " + equilateral);
        System.out.println("Cantidad de triangulos isosceles ingresados: " + isosceles);
        System.out.println("Cantidad de triangulos escalenos ingresados: " + scalene);
        if (equilateral < isosceles && equilateral < scalene) {
            System.out.println("Menor cantidad de triangulos ingresados: Equilatero");
        } else if (isosceles < scalene) {
            System.out.println("Menor cantidad de triangulos ingresados: Isosceles");
        } else {
            System.out.println("Menor cantidad de triangulos ingresados: Escaleno");
        }
    }
}