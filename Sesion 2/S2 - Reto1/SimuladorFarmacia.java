import java.util.Scanner;

//Clase principal
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Solicitar datos al ususario
    System.out.print("Nombre del medicamento: ");
    String medicamento = sc.nextLine();

    System.out.print("Precio unitario: ");
    double precioUnitario = sc.nextDouble();

    System.out.print("Cantidad de piezas: ");
    int cantidad = sc.nextInt();

    //Calcular el total
    double totalSinDescuento = precioUnitario * cantidad;

    // Uso de var y evaluacion del descuento
    var aplicaDescuento = totalSinDescuento > 500;
    double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

    //Total a pagar
    double totalPagar = totalSinDescuento - descuento;

    //Resumen de la compra
    System.out.println("\n--- Resumen de compra ---");
    System.out.println("Medicamento: " + medicamento);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Precio unitario: $" + precioUnitario);
    System.out.println("Total sin descuento: $" + totalSinDescuento);
    System.out.println("¿Aplica descuento?: " + aplicaDescuento);
    System.out.println("Descuento: $" + descuento);
    System.out.println("Total a pagar: $" + totalPagar);

    sc.close();
}
}