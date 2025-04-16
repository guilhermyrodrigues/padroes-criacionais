package ex02;

public class XiaomiFactory implements DispositivosFactory{
    @Override
    public Lampada criarLampada() {
        return new LampadaXiaomi();
    }

    @Override
    public Termostato criarTermostato() {
        return new TermostatoXiaomi();
    }
}
