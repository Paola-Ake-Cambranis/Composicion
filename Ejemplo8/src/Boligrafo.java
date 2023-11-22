class Boligrafo {
    private String marca;
    private Pluma pluma; // Composición: El bolígrafo tiene una pluma

    public Boligrafo(String marca, Pluma pluma) {
        this.marca = marca;
        this.pluma = pluma;
    }

    public String getMarca() {
        return marca;
    }

    public Pluma getPluma() {
        return pluma;
    }
}