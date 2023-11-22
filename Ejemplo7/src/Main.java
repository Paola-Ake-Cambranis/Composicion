public class Main {
    public static void main(String[] args) {
        Aspas aspasVentilador = new Aspas(30);

        Ventilador miVentilador = new Ventilador("XYZ", aspasVentilador);

        System.out.println("Marca del ventilador: " + miVentilador.getMarca());
        System.out.println("Longitud de las aspas: " + miVentilador.getAspas().getLongitud() + " centímetros");
    }

}