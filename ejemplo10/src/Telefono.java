class Telefono {
    private String modelo;
    private Chip chip;

    public Telefono(String modelo, Chip chip) {
        this.modelo = modelo;
        this.chip = chip;
    }

    public String getModelo() {
        return modelo;
    }

    public Chip getChip() {
        return chip;
    }
}
