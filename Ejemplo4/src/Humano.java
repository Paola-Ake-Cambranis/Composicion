class Humano {
    private String nombre;
    private int edad;
    private Corazon corazon;

    public Humano(String nombre, int edad, Corazon corazon) {
        this.nombre = nombre;
        this.edad = edad;
        this.corazon = corazon;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void realizarActividad() {
        System.out.println(nombre + " está realizando una actividad.");
        corazon.latir(); 
    }
}