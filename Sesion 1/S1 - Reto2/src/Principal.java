/*
Desarrollar un programa en Java que permita registrar la información básica de entradas para eventos,
aplicando los fundamentos de clases, objetos, atributos, métodos y el uso de constructores.
*/
public class Principal {
    public static void main(String[] args) {
        // Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);

        // Mostrar la información
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    // Uso del record
        Entrada.Entrada_Record entradaRecord = new Entrada.Entrada_Record("Feria del Libro", 150.0);
        System.out.println("\n--- Entrada usando Record ---");
        entradaRecord.mostrarInformacionrecord();
    }
}