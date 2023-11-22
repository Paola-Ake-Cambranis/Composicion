class Casa {
    private String direccion;
    private Pared paredPrincipal; 

    public Casa(String direccion, Pared paredPrincipal) {
        this.direccion = direccion;
        this.paredPrincipal = paredPrincipal;
    }

    public String getDireccion() {
        return direccion;
    }

    public Pared getParedPrincipal() {
        return paredPrincipal;
    }
}
