public class Veiculos {

    private String placa;
    private String marca;

    public Veiculos(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
                "\nPlaca: " + placa +
                "\nMarca: " + marca;
    }
}
