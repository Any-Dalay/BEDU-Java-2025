public class Factura {
    //Atributos
    private String folio;
    private String cliente;
    private double total;

    //Constructor
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    //Metodo para ver el objeto de foroma legible
    @Override
    public String toString(){
        return "Factura folio = " + folio + ", cliente = " + cliente + ", total = $" + total;
    }

    //Metodo para comparar si dos facturas tienen mismo folio
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }

    @Override
    public int hashCode() { return folio.hashCode(); }
}

