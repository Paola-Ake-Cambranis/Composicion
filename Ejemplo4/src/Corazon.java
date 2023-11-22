class Corazon {
    private String tipo;

    public Corazon(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void latir() {
        System.out.println("Latido del corazón");
    }
}