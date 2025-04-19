package ex03;

public class CarroFactory implements VeiculoFactory{
    private Integer numeroPortas;

    public CarroFactory(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public Veiculo criarVeiculo() {
        return new Carro(numeroPortas);
    }
}
