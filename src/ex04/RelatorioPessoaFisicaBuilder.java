package ex04;

public class RelatorioPessoaFisicaBuilder implements RelatorioBuilder{
    private Relatorio relatorio = new Relatorio();


    @Override
    public void construirCabecalho() {
        relatorio.setCabecalho("Relatório: Fluxo de Caixa - Pessoa Física");
    }

    @Override
    public void construirCorpo() {
        relatorio.setCorpo("Entradas: R$5.000\nSaídas: R$3.200");
    }

    @Override
    public void construirRodape() {
        relatorio.setRodape("Emitido para: João da Silva");
    }

    @Override
    public Relatorio getRelatorio() {
        return relatorio;
    }
}
