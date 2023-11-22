public class Main {
    public static void main(String[] args) {

        Pagina paginaInicio = new Pagina(1);
        Libro miLibro = new Libro("El Gran Libro", paginaInicio);

        System.out.println("Título del libro: " + miLibro.getTitulo());
        System.out.println("Página actual: " + miLibro.getPaginaActual().getNumero());


        miLibro.pasarPagina();

        System.out.println("Página actual después de pasar: " + miLibro.getPaginaActual().getNumero());
    }
}