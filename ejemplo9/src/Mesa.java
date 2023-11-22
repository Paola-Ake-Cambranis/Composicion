class Mesa {
    private String material;
    private Pata pata1;
    private Pata pata2;
    private Pata pata3;
    private Pata pata4;

    public Mesa(String material, Pata pata1, Pata pata2, Pata pata3, Pata pata4) {
        this.material = material;
        this.pata1 = pata1;
        this.pata2 = pata2;
        this.pata3 = pata3;
        this.pata4 = pata4;
    }

    public String getMaterial() {
        return material;
    }

    public Pata getPata1() {
        return pata1;
    }

    public Pata getPata2() {
        return pata2;
    }

    public Pata getPata3() {
        return pata3;
    }

    public Pata getPata4() {
        return pata4;
    }
}