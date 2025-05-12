public class CentralEmergencias {
    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Ana");
        Patrulla patrulla = new Patrulla("Patrulla", "Pedro");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad Bomberos", "Alan");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
