package ex04;

public class Relatorio {

    private String cabecalho;
    private String corpo;
    private String rodape;

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    public void exibir() {
        System.out.println("=== RELATÓRIO ===");
        System.out.println(cabecalho);
        System.out.println(corpo);
        System.out.println(rodape);
    }
}
