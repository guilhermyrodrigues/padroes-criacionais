package ex01;

public class Main {
    public static void main(String[] args) {
        Restaurante pizzaria = new Pizzaria("Grande");
        Pedido pedidoPizza = pizzaria.criarPedido();
        System.out.println(pedidoPizza.descricao());

        Restaurante hamburgueria = new Hamburgueria("Mal Passada");
        Pedido pedidoHamburguer = hamburgueria.criarPedido();
        System.out.println(pedidoHamburguer.descricao());

        /*
        Justificativo do padrão escolhido:

        O padrão Factory Method foi escolhido porque ele delega a criação dos objetos Pedido para as subclasses (Pizzaria e Hamburgueria).
        Isso permite que cada restaurante defina o tipo de pedido que será criado,
        sem que o código cliente precise conhecer os detalhes da criação.
        A adição de novos tipos de restaurantes requer apenas a criação de novas subclasses de Restaurante,
        mantendo o código cliente inalterado.
         */
    }
}
