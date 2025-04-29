package Hospital;

public class Paciente {
    // Atributos
    private String nombre;
    private int edad;
    private String expediente;

    // Constructor
    public Paciente(String nombre, int edad, String expediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.expediente = expediente;
    }

    // Método para mostrar la información del paciente
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
