public class Coche{
    private String modelo;
    private Motor motor;

    public Coche(String modelo, Motor motor){
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo(){
        return modelo;
    }

    public Motor getMotor(){
        return motor;
    }
}