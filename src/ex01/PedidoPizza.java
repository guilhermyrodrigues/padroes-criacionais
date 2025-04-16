package ex01;

public class PedidoPizza implements Pedido{
    private String tamanho;

    public PedidoPizza(String tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String descricao() {
        return "Pedido de Pizza tamanho " + tamanho;
    }
}
