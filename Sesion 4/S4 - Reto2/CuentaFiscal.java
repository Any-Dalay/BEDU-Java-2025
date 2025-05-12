import java.util.Objects;

public class CuentaFiscal {

    private final String rfc;
    private double saldoDisponible;

    //Constructor con validacion de saldo
    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible >= 0){
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo. Se asigna 0");
            this.saldoDisponible = 0;
        }
    }

    //Getters
    public String getRfc() { return rfc; }

    public double getSaldoDisponible() { return saldoDisponible; }

    //Metodo para validar RFC
    public boolean validarRFC(DeclaracionImpuestos d) { return Objects.equals(this.rfc, d.rfcContribuyente()); }

    //Metodo para mostrar informacion de la cuenta
    public void mostrarCuenta() {
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", Saldo Disponible: $" + saldoDisponible);
    }
}
