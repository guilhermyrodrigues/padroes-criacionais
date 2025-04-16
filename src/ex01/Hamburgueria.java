package ex01;

public class Hamburgueria extends Restaurante{
    private String pontoCarne;

    public Hamburgueria(String pontoCarne) {
        this.pontoCarne = pontoCarne;
    }

    @Override
    public Pedido criarPedido() {
        return new PedidoHamburguer(pontoCarne);
    }

}
