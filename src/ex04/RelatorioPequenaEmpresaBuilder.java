package ex04;

public class RelatorioPequenaEmpresaBuilder implements RelatorioBuilder{
    private Relatorio relatorio = new Relatorio();


    @Override
    public void construirCabecalho() {
        relatorio.setCabecalho("Relatório: Balanço Patrimonial - Pequena Empresa");
    }

    @Override
    public void construirCorpo() {
        relatorio.setCorpo("Ativos: R$100.000\nPassivos: R$50.000");
    }

    @Override
    public void construirRodape() {
        relatorio.setRodape("Emitido por: Sistema");
    }

    @Override
    public Relatorio getRelatorio() {
        return relatorio;
    }
}
