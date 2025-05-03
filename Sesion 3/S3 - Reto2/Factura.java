import java.util.Optional;

public class Factura {
    //Atributos
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //Metodo
    public String getResumen(){
        String resumen = "Factura generada:\n";
        resumen += "Descripcion: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        resumen += "RFC: " + rfc.orElse("No proporcionado") + "\n";

        return resumen;
    }
}
