public class Moto extends Veiculos {

    private String modelo;

    public Moto(String placa, String marca, String modelo) {
        super(placa, marca);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nMOTO" + super.toString() +        
                "\nModelo: " + modelo + "\n";
    }
}