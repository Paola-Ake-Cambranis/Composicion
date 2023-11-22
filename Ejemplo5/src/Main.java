public class Main {
    public static void main(String[] args) {

        Pared paredPrincipal = new Pared("Ladrillo");

        Casa miCasa = new Casa("123 Calle Principal", paredPrincipal);

        System.out.println("Dirección de la casa: " + miCasa.getDireccion());
        System.out.println("Material de la pared principal: " + miCasa.getParedPrincipal().getMaterial());
    }
}