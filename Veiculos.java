public class Carro extends Veiculos {

    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        super(placa, marca);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nCARRO" + super.toString() +        
                "\nModelo: " + modelo + "\n";
    }
}