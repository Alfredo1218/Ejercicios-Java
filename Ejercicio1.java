package tuesta_abisrror;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a VEGA IMPORT :D");
        int sex, cant, precio, clase, talla, montN;
        double dsct = 0, precF;
        System.out.println("Ingrese Sexo:"
                + "\n 1. HOMBRE"
                + "\n 2. MUJER");
        sex = teclado.nextInt();

        System.out.println("Ingrese orígen de pedido:"
                + "\n 1. Nacional"
                + "\n 2. Importado");
        clase = teclado.nextInt();

        System.out.println("Ingrese precio de producto en soles: ");
        precio = teclado.nextInt();
        System.out.println("Ingrese cantidad de productos comprados");
        cant = teclado.nextInt();
        montN = precio * cant;

        switch (sex) {
            case 1:
                if (clase == 1) {
                    System.out.println("¿Cuál es su Talla: "
                            + "\n 1. S"
                            + "\n 2. M"
                            + "\n 3. L");
                    talla = teclado.nextInt();
                    if (talla == 1) {
                        dsct = montN * 0.10;
                    } else if (talla == 2) {
                        dsct = montN * 0.12;
                    } else if (talla == 3) {
                        dsct = montN * 0.15;
                    }
                } else if (clase == 2) {
                    System.out.println("¿Cuál es su Talla: "
                            + "\n 1. S"
                            + "\n 2. M"
                            + "\n 3. L");
                    talla = teclado.nextInt();
                    if (talla == 1) {
                        dsct = montN * 0.15;
                    } else if (talla == 2) {
                        dsct = montN * 0.17;
                    } else if (talla == 3) {
                        dsct = montN * 0.20;
                    }
                }
                break;
            case 2:
                if (clase == 1) {
                    System.out.println("¿Cuál es su Talla: "
                            + "\n 1. S"
                            + "\n 2. M"
                            + "\n 3. L");
                    talla = teclado.nextInt();
                    if (talla == 1) {
                        dsct = montN * 0.5;
                    } else if (talla == 2) {
                        dsct = montN * 0.7;
                    } else if (talla == 3) {
                        dsct = montN * 0.10;
                    }
                } else if (clase == 2) {
                    System.out.println("¿Cuál es su Talla: "
                            + "\n 1. S"
                            + "\n 2. M"
                            + "\n 3. L");
                    talla = teclado.nextInt();
                    if (talla == 1) {
                        dsct = montN * 0.7;
                    } else if (talla == 2) {
                        dsct = montN * 0.9;
                    } else if (talla == 3) {
                        dsct = montN * 0.12;
                    }
                }
                break;
        }
        precF = montN - dsct;
        System.out.println("El monto comprado es: " + montN);
        System.out.println("El descuento de su compra es " + dsct);
        System.out.println("El monto Neto es: s/. " + precF);

    }

}
