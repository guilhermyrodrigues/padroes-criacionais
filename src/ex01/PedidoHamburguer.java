package ex01;

public class PedidoHamburguer implements Pedido{

    private String pontoCarne;

    public PedidoHamburguer(String pontoCarne) {
        this.pontoCarne = pontoCarne;
    }
    public String descricao() {
        return "Pedido de Hambúrguer com carne: " + pontoCarne;
    }
}
