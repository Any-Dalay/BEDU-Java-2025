/*
Implementar un programa que simule un cajero automático básico, aplicando estructuras de control como while,
switch, break y continue para navegar entre opciones y validar operaciones del usuario.
*/

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar el saldo del cajero automático
        double saldo = 1000.0;
        int opcion;

        //Repetir el menú
        do {
            // Mostrar el menú
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            // Leer la opción seleccionada por el usuario
            System.out.print("Por favor, elija una opción: ");
            opcion = scanner.nextInt();

            // Manejo de opciones del menú
            switch (opcion) {
                case 1: // Consultar saldo
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 2: // Depositar dinero
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("El monto a depositar debe ser mayor a 0.");
                    } else {
                        saldo += deposito; //Aumenta saldo
                        System.out.println("Has depositado: $" + deposito);
                        System.out.println("Tu saldo actual es: $" + saldo);
                    }
                    break;

                case 3: // Retirar dinero
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = scanner.nextDouble();

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                        // Continuar con el siguiente ciclo sin hacer nada
                        break;
                    }
                    if (retiro <= 0) {
                        System.out.println("El monto a retirar debe ser mayor a 0.");
                    } else {
                        saldo -= retiro; //Restar monto del saldo
                        System.out.println("Has retirado: $" + retiro);
                        System.out.println("Tu saldo actual es: $" + saldo);
                    }
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                    break;
            }

        } while (opcion != 4); // Salir cuando el usuario elija la opción 4

        // Cerrar el objeto Scanner
        scanner.close();
    }
}