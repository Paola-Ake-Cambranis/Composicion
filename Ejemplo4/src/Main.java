public class Main {
    public static void main(String[] args) {
        Corazon corazonHumano = new Corazon("Normal");
        Humano persona = new Humano("Juan", 30, corazonHumano);

        persona.realizarActividad();
    }
}

