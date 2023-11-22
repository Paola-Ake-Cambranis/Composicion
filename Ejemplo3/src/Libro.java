class Libro {
    private String titulo;
    private Pagina paginaActual;

    public Libro(String titulo, Pagina paginaInicial) {
        this.titulo = titulo;
        this.paginaActual = paginaInicial;
    }

    public String getTitulo() {
        return titulo;
    }

    public Pagina getPaginaActual() {
        return paginaActual;
    }

    public void pasarPagina() {
        int numeroPaginaSiguiente = paginaActual.getNumero() + 1;
        this.paginaActual = new Pagina(numeroPaginaSiguiente);
    }
}
