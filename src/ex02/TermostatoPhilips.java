package ex02;

public class TermostatoPhilips implements Termostato{
    @Override
    public String configurar() {
        return "Configurando termostato Philips com temperatura e horário.";
    }
}
