package ex01;

public class Pizzaria extends Restaurante{
    private String tamanhoPizza;

    public Pizzaria(String tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    @Override
    public Pedido criarPedido() {
        return new PedidoPizza(tamanhoPizza);
    }
}
