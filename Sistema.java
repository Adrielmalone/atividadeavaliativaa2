public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nSISTEMA DE CADASTRO DE VEÍCULOS");
        System.out.println("1) Cadastrar Carro");
        System.out.println("2) Cadastrar Moto");
        System.out.println("3) Cadastrar Caminhão");
        System.out.println("4) Buscar Veículo");
        System.out.println("5) Excluir Veículo");
        System.out.println("6) Listar Todos os Veículos");
        System.out.println("7) Excluir Todos os Veículos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void cadastrarCarro() {
        System.out.println("\nCadastro de Carro:");
        System.out.print("Placa: ");
        String placa = Console.lerString();
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();
        Carro carro = new Carro(placa, marca, modelo);
        CadastroVeiculos.cadastrarVeiculo(carro);
    }

    private static void cadastrarMoto() {
        System.out.println("\nCadastro de Moto:");
        System.out.print("Placa: ");
        String placa = Console.lerString();
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();

        Moto moto = new Moto(placa, marca, modelo);
        CadastroVeiculos.cadastrarVeiculo(moto);
    }

    private static void cadastrarCaminhao() {
        System.out.println("\nCadastro de Caminhão:");
        System.out.print("Placa: ");
        String placa = Console.lerString();
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();

        Caminhao caminhao = new Caminhao(placa, marca, modelo);
        CadastroVeiculos.cadastrarVeiculo(caminhao);
    }

    private static void buscarVeiculo() {
        System.out.println("\nBuscar Veículo:");
        System.out.print("Placa: ");
        String placa = Console.lerString();
        Veiculos veiculo = CadastroVeiculos.buscarVeiculo(placa);
        if (veiculo != null) {
            System.out.println("\nVeículo Encontrado:");
            System.out.println(veiculo.toString());
        } else {
            System.out.println("\nVeículo não encontrado.");
        }
    }

    private static void excluirVeiculo() {
        System.out.println("\nExcluir Veículo:");
        System.out.print("Placa: ");
        String placa = Console.lerString();
        CadastroVeiculos.excluirVeiculo(placa);
        System.out.println("Veículo excluído com sucesso.");
    }

    private static void listarTodosVeiculos() {
        System.out.println("\nListar Todos os Veículos:");
        CadastroVeiculos.listarTodosVeiculos();
    }

    private static void excluirTodosVeiculos() {
        System.out.println("\nExcluir Todos os Veículos:");
        CadastroVeiculos.excluirTodosVeiculos();
        System.out.println("Todos os veículos foram excluídos.");
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                cadastrarCarro();
                break;
            case 2:
                cadastrarMoto();
                break;
            case 3:
                cadastrarCaminhao();
                break;
            case 4:
                buscarVeiculo();
                break;
            case 5:
                excluirVeiculo();
                break;
            case 6:
                listarTodosVeiculos();
                break;
            case 7:
                excluirTodosVeiculos();
                break;
            case 0:
                System.out.println("\nO programa foi finalizado.");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }

    public static void main(String[] args) {
        executar();
    }

}