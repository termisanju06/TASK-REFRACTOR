package org.termi;


import java.util.Scanner;

public class refactor {

    public static Scanner scanner;

    public static void main(String[] args) {
        int opt;
        do {
            opt = getOpt();

            if (opt == 1) {

                printSuma(getSuma(getNmentero()));

            } else if (opt == 2) {

                printMedia(getMedia(getNmentero()));

            } else if (opt == 3) {
                printSalir();

            } else {
                printError();
            }

        } while (opt != 3);
    }

    private static void printError() {
        System.out.println("Opción inválida");
    }

    private static void printSalir() {
        System.out.println("Saliendo...");
    }

    private static void printMedia(int sum) {
        sum = getMedia(getNmentero());
        System.out.println("La media es " + (sum));
    }

    private static void printSuma(int suma) {
        suma = getSuma(getNmentero());
        System.out.println("El sumatorio es " + suma);
    }

    private static int getMedia(int nmentero) {
        int sum = 0;
        nmentero = getNmentero();
        for (int i = 0; i < nmentero; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        sum = sum / nmentero;
        return sum;
    }

    private static int getSuma(int nmentero) {
        int suma = 0;
        nmentero = getNmentero();
        for (int i = 1; i <= nmentero; i++) {
            suma += i;
        }
        return suma;
    }

    private static int getNmentero() {
        int nmentero;
        do {
            System.out.print("Introduce un entero positivo: ");
            nmentero = scanner.nextInt();
            scanner.nextLine();
        } while (nmentero <= 0);
        return nmentero;
    }

    private static int getOpt() {
        int opt;
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
        opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
}
