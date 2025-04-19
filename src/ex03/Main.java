package ex03;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory fabricaCarro = new CarroFactory(4);
        Veiculo carro = fabricaCarro.criarVeiculo();
        carro.descricao(); // Carro com 4 portas

        VeiculoFactory fabricaMoto = new MotoFactory(150);
        Veiculo moto = fabricaMoto.criarVeiculo();
        moto.descricao(); // Moto com 150 cilindradas

        /*
        O padrão Factory Method foi escolhido para encapsular a criação de diferentes tipos de veículos.
        As fábricas concretas (FabricaCarro, FabricaMoto) são responsáveis por instanciar os objetos Veiculo específicos.
        Isso oculta a complexidade da criação do código cliente, que apenas solicita um Veiculo à fábrica,
        sem se preocupar com os detalhes de qual tipo de veículo será criado.
        Adicionar novos tipos de veículos é simples: basta criar uma nova fábrica concreta.
         */
    }

}
