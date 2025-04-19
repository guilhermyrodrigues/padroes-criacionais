package ex03;

public class Carro implements Veiculo{

    private Integer mumeroPortas;

    public Carro(Integer numeroPortas) {
        this.mumeroPortas = numeroPortas;
    }

    @Override
    public void descricao() {
        System.out.println("Carro com " + mumeroPortas + " portas");
    }
}
