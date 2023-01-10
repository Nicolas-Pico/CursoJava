package CasoEstudioJava;

import java.util.Scanner;

public class CasoEstudioJava {

    public static void main(String[] args) {

        //creamos variables y llamamos scanner
        Scanner teclado=new Scanner (System.in);
        int opcion, opcion1 = 0, opcion2=0, cantidad;
        boolean retorno=false;

        do {
            //leer y pedir opcion
            System.out.println("<===BIENVENIDO A IZYSHOP===>");
            System.out.println("1. COMPRAR CAMISETAS");
            System.out.println("2. COMPRAR PANTALONES");
            System.out.println("3. COMPRAR ZAPATOS");
            System.out.println("4. SALIR E IMPRIMIR TOTAL");
            System.out.print("ESCOJA LA OPCION CON LA CUAL QUIERE CONTINUAR:");
            opcion=teclado.nextInt();

            //leer y pedir talla
            switch(opcion) {
                case 1:
                    System.out.println("¿QUE TALLA DESEA LLEVAR?");
                    System.out.println("1. TALLA S");
                    System.out.println("2. TALLA M");
                    System.out.println("3. TALLA L");
                    System.out.println("4. RETORNAR");
                    System.out.print("POR FAVOR ELIJA UNA OPCION:");
                    opcion1=teclado.nextInt();
                    break;
                case 2:
                    System.out.println("¿QUE TALLA DESEA LLEVAR?");
                    System.out.println("1. TALLA 30");
                    System.out.println("2. TALLA 32");
                    System.out.println("3. RETORNAR");
                    System.out.print("POR FAVOR ELIJA UNA OPCION:");
                    opcion2=teclado.nextInt();
                    break;
                case 3:
                    System.out.print("¡NO HAY STOCK DISPONIBLE!");
                    System.out.println("1. RETORNAR");
                    break;
                case 4:

                    break;
            }

            //leer e ingresar cantidad para camisetas
            switch(opcion1) {
                case 1:
                    float porcentaje, producto = 0, total = 0;
                    System.out.println("PRECIO POR UNIDAD $20000");
                    System.out.print("CANTIDAD DE CAMISETAS QUE DESEA LLEVAR:");
                    cantidad=teclado.nextInt();
                    if (cantidad>100) {
                        System.out.print("NO HAY TANTAS UNIDADES DISPONIBLES");
                    }else {
                        if(cantidad>=30) {
                            producto=cantidad*20000;
                            porcentaje=(producto*15)/100;
                            total=producto-porcentaje;
                        }
                    }
                    break;
                case 2:
                    float porcentaje1, producto1, total1 = 0;
                    System.out.println("PRECIO POR UNIDAD $25000");
                    System.out.print("CANTIDAD DE CAMISETAS QUE DESEA LLEVAR:");
                    cantidad=teclado.nextInt();
                    if (cantidad>150) {
                        System.out.print("NO HAY TANTAS UNIDADES DISPONIBLES");
                    }else {
                        if(cantidad>=30) {
                            producto1=cantidad*25000;
                            porcentaje1=(producto1*15)/100;
                            total1=producto1-porcentaje1;
                        }
                    }
                    break;
                case 3:
                    float porcentaje2, producto2, total2 = 0;
                    System.out.println("PRECIO POR UNIDAD $30000");
                    System.out.print("CANTIDAD DE CAMISETAS QUE DESEA LLEVAR:");
                    cantidad=teclado.nextInt();
                    if (cantidad>200) {
                        System.out.print("NO HAY TANTAS UNIDADES DISPONIBLES");
                    }else {
                        if(cantidad>=30) {
                            producto2=cantidad*30000;
                            porcentaje2=(producto2*15)/100;
                            total2=producto2-porcentaje2;
                        }
                    }
                    break;
                case 4:

                    break;
            }

            //leer e ingresar cantidad para pantalones
            switch(opcion2) {
                case 1:
                    float porcentaje, producto, total = 0;
                    System.out.println("PRECIO POR UNIDAD $50000");
                    System.out.print("CANTIDAD DE PANTALONES QUE DESEA LLEVAR:");
                    cantidad=teclado.nextInt();
                    if(cantidad>=15) {
                        producto=cantidad*50000;
                        porcentaje=(producto*10)/100;
                        total=producto-porcentaje;
                    }
                    break;
                case 2:
                    float porcentaje1, producto1, total1 = 0;
                    System.out.println("PRECIO POR UNIDAD $50000");
                    System.out.print("CANTIDAD DE PANTALONES QUE DESEA LLEVAR:");
                    cantidad=teclado.nextInt();
                    if(cantidad>=15) {
                        producto1=cantidad*50000;
                        porcentaje1=(producto1*10)/100;
                        total1=producto1-porcentaje1;
                    }
                    break;
                case 3:

                    break;
            }

        }while(opcion!=4);
    }
}