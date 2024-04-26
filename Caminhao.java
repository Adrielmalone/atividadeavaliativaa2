public class Caminhao extends Veiculos {

    private String modelo;

    public Caminhao(String placa, String marca, String modelo) {
        super(placa, marca);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nCAMINHNAO" + super.toString() +        
                "\nModelo: " + modelo + "\n";
    }
}