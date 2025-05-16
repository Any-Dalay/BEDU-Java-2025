import java.util.Scanner;
public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué harías?");
        System.out.println("A: Regresar el cambio a tu mamá💰");
        System.out.println("B: Gastar el cambio en las maquinitas 👻");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}

