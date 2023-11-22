public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Motor
        Motor motorCoche = new Motor("Motor de Gasolina");

        // Crear un objeto de la clase Coche y asignarle el motor
        Coche miCoche = new Coche("Sedan", motorCoche);

        // Obtener información sobre el coche y su motor
        System.out.println("Modelo del coche: " + miCoche.getModelo());
        System.out.println("Tipo de motor: " + miCoche.getMotor().getTipo());
    }
}