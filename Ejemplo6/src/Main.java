public class Main {
    public static void main(String[] args) {
 
        Pantalla pantallaTelevision = new Pantalla("LED", 55);

        Television miTelevision = new Television("Sony", pantallaTelevision);

        System.out.println("Marca de la televisión: " + miTelevision.getMarca());
        System.out.println("Tipo de pantalla: " + miTelevision.getPantalla().getTipo());
        System.out.println("Tamaño de pantalla: " + miTelevision.getPantalla().getTamañoPulgadas() + " pulgadas");
    }
}