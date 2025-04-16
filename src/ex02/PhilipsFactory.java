package ex02;

public class PhilipsFactory implements DispositivosFactory{
    @Override
    public Lampada criarLampada() {
        return new LampadaPhilips();
    }

    @Override
    public Termostato criarTermostato() {
        return new TermostatoPhilips();
    }
}
