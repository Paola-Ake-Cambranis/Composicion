class Pantalla {
    private String tipo;
    private int tamañoPulgadas;

    public Pantalla(String tipo, int tamañoPulgadas) {
        this.tipo = tipo;
        this.tamañoPulgadas = tamañoPulgadas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamañoPulgadas() {
        return tamañoPulgadas;
    }
}