public class Entrada {
    // Atributos
    private String nombreEvento;
    private double precio;

    // Constructor
    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    // Metodo para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }

    //Usando Record
    public record Entrada_Record(String nombreEvento, double precio) {
        public void mostrarInformacionrecord() {
            System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
        }
    }
}

