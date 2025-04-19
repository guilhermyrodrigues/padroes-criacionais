package ex04;

public interface RelatorioBuilder {
    void construirCabecalho();
    void construirCorpo();
    void construirRodape();
    Relatorio getRelatorio();
}
