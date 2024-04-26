import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculos {

    private static List<Veiculos> veiculos = new ArrayList<>();
    

    public static void cadastrarVeiculo(Veiculos veiculo) {
        veiculos.add(veiculo);
    }

    public static Veiculos buscarVeiculo(String placa) {
        for (Veiculos veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public static void excluirVeiculo(String placa) {
        veiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public static void excluirTodosVeiculos() {
        veiculos.clear();
    }

    public static void listarTodosVeiculos() {
        for (Veiculos veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }
}


