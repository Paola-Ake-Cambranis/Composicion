public class Main {
    public static void main(String[] args) {
    
        Chip chipTelefono = new Chip("Movistar");

        Telefono miTelefono = new Telefono("iPhone", chipTelefono);

        System.out.println("Modelo del teléfono: " + miTelefono.getModelo());
        System.out.println("Operador del chip: " + miTelefono.getChip().getOperador());
    }
}