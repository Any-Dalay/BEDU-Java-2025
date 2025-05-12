
public class Principal {
    public static void main(String[] args) {

        //Creamos dos facturas con mismo folio
        Factura f1 = new Factura("FAC001", "Anadalay L.", 1450.00);
        Factura f2 = new Factura("FAC001", "Alan P.", 1450.00);

        //Usar toString para mostrar las facturas
        System.out.println(f1);
        System.out.println(f2);

        //Comparar si son iguales con equals
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}