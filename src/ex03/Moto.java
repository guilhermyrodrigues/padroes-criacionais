package ex03;

public class Moto implements Veiculo{

    private Integer cilindradas;

    public Moto(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void descricao() {
        System.out.println("Moto com " + cilindradas + " cilindradas");
    }
}
