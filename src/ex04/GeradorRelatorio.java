package ex04;

public class GeradorRelatorio {
    public void construirRelatorio(RelatorioBuilder builder) {
        builder.construirCabecalho();
        builder.construirCorpo();
        builder.construirRodape();
    }
}
