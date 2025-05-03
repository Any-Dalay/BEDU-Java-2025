
public class Principal {
    public static void main(String[] args) {
       //Crear un pasajero
        Pasajero pasajero = new Pasajero("Anadalay Laureani", "P123456");

        //Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "Japón", "12:30");

        //Reservar asientp
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println("Reserva realizada con éxito. \n");
        } else {
            System.out.println("No se realizo la reserva. \n");
        }

        //Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println("Cancelando reserva... \n");
        vuelo.cancelarReserva();

        //Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizar una nuevaa reservacion
        vuelo.reservarAsiento("Ariana Grande", "P456789");
        System.out.println(vuelo.obtenerItinerario());
    }
}