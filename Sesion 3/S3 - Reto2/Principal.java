
public class Principal {
    public static void main(String[] args) {

        //Factura con RFC
        Factura facturaConRFC = new Factura(2500, "Servicio de consultoria", "ABCC010101XYZ");

        //Factura sin RFC
        Factura facturasinRFC = new Factura(1800, "Reparacion de equipo", null);

        //Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturasinRFC.getResumen());
    }
}