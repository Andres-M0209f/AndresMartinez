package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Se crea el scanner para que el sistema lea las entradas
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta;

        System.out.println("¿Desea ingresar un saldo inicial?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("Seleccione una opción: ");

        int respuesta = sc.nextInt();

        //Si responde que si, se hace el proceso de ingresar el saldo

        if (respuesta == 1) {

            int saldoInicial;

            System.out.print("Ingrese el saldo inicial: ");
            saldoInicial = sc.nextInt();

            cuenta = new Cuenta(saldoInicial);

        } else {

            cuenta = new Cuenta(); //La cuenta inicia en 0 al elegir opcion 2
        }

        boolean continuar = true;

        //Creamos el menu para gestionar el cajero
        while (continuar) {

            System.out.println("\n--- Menú de Cuenta ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("");

            int opcion = sc.nextInt(); // Lee la opción del usuario

            switch (opcion) {

                // Opción de depósito
                case 1:
                    System.out.print("Monto a depositar: ");
                    int deposito = sc.nextInt();
                    cuenta.deposito(deposito);
                    break;

                // Opción de retiro
                case 2:
                    System.out.print("Monto a retirar: ");
                    int retiro = sc.nextInt();
                    cuenta.retiro(retiro);
                    break;

                // Mostrar saldo actual
                case 3:
                    System.out.println("Saldo actual: $" + cuenta.getSaldo());
                    break;

                case 4:
                    System.out.println("Vuelve pronto");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}