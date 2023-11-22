public class Main {
    public static void main(String[] args) {

        Pluma plumaBoligrafo = new Pluma("Gel");

       
        Boligrafo miBoligrafo = new Boligrafo("BIC", plumaBoligrafo);

        System.out.println("Marca del bolígrafo: " + miBoligrafo.getMarca());
        System.out.println("Tipo de tinta de la pluma: " + miBoligrafo.getPluma().getTipoTinta());
    }
}