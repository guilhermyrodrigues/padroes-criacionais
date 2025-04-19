package ex02;

public class Main {
    public static void main(String[] args) {
        // Configurar dispositivos da Philips
        DispositivosFactory philips = new PhilipsFactory();
        Lampada lampadaPhilips = philips.criarLampada();
        Termostato termostatoPhilips = philips.criarTermostato();
        System.out.println(lampadaPhilips.configurar());
        System.out.println(termostatoPhilips.configurar());

        System.out.println("------");

        // Configurar dispositivos da Xiaomi
        DispositivosFactory xiaomi = new XiaomiFactory();
        Lampada lampadaXiaomi = xiaomi.criarLampada();
        Termostato termostatoXiaomi = xiaomi.criarTermostato();
        System.out.println(lampadaXiaomi.configurar());
        System.out.println(termostatoXiaomi.configurar());

        /*
        Justificativa do padrão escolhido

        O padrão Abstract Factory foi escolhido para criar famílias de dispositivos IoT relacionados.
        Cada fábrica concreta (FabricaPhilips, FabricaXiaomi) é responsável por criar os produtos (lâmpada, termostato) de um fabricante específico,
        garantindo que os dispositivos sejam compatíveis entre si.  O código cliente interage com a Abstract Factory para obter os dispositivos,
        sem se preocupar com os detalhes de implementação de cada fabricante.
         */

    }
}
