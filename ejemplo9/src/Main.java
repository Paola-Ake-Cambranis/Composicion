public class Main {
    public static void main(String[] args) {

        Pata pata1 = new Pata(75);
        Pata pata2 = new Pata(75);
        Pata pata3 = new Pata(75);
        Pata pata4 = new Pata(75);

        Mesa miMesa = new Mesa("Madera", pata1, pata2, pata3, pata4);

        // Obtener información sobre la mesa y sus patas
        System.out.println("Material de la mesa: " + miMesa.getMaterial());
        System.out.println("Altura de la pata 1: " + miMesa.getPata1().getAltura() + " centímetros");
        System.out.println("Altura de la pata 2: " + miMesa.getPata2().getAltura() + " centímetros");
        System.out.println("Altura de la pata 3: " + miMesa.getPata3().getAltura() + " centímetros");
        System.out.println("Altura de la pata 4: " + miMesa.getPata4().getAltura() + " centímetros");
    }
}