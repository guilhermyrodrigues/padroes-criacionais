package ex03;

public class MotoFactory implements VeiculoFactory{
    private Integer cilindradas;

    public MotoFactory(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public Veiculo criarVeiculo() {
        return new Moto(cilindradas);
    }
}
