class Television {
    private String marca;
    private Pantalla pantalla;  // Composición: La televisión tiene una pantalla

    public Television(String marca, Pantalla pantalla) {
        this.marca = marca;
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }
}