
public class MainNarrativa {
    public static void main(String[] args) {
// Simulación inicial
        PaqueteNarrativo paquete = new PaqueteNarrativo("En la tortillería");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}