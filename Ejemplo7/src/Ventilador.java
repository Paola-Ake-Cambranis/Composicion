class Ventilador {
    private String marca;
    private Aspas aspas;

    public Ventilador(String marca, Aspas aspas) {
        this.marca = marca;
        this.aspas = aspas;
    }

    public String getMarca() {
        return marca;
    }

    public Aspas getAspas() {
        return aspas;
    }
}