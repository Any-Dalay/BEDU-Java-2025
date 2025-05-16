


public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("➡️ Llegaste a tiempo, la comida esta lista😋...");
        } else {
            System.out.println("➡️ Oh no, las tortillas se enfriaron... tu mamá se enojó por no llegar a tiempo😰");
        }
    }
}

