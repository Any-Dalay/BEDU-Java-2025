package Hospital;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el número de expediente: ");
        String expediente = scanner.nextLine();

        // Crear el objeto Paciente
        Paciente paciente = new Paciente(nombre, edad, expediente);

        // Mostrar la información del paciente
        System.out.println("\n--- Información del Paciente ---");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
