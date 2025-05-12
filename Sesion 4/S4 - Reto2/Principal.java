
public class Principal {
    public static void main(String[] args) {

        //Creamos una declaracion de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("KAXX010101000", 7500.00);

        //Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("KAXX010101000", 8500.00);

        //Mostramos la informacion
        System.out.println("Declaracion enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        //Validamos si el RFC de la declaracion es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿El RFC es válido para esta cuenta?: " + rfcValido);

    }
}