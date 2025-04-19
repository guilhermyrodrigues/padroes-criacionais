package ex04;

public class Main {
    public static void main(String[] args) {
        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();

        // Relatório para pequena empresa
        RelatorioBuilder builderEmpresa = new RelatorioPequenaEmpresaBuilder();
        geradorRelatorio.construirRelatorio(builderEmpresa);
        Relatorio relatorioEmpresa = builderEmpresa.getRelatorio();
        relatorioEmpresa.exibir();

        System.out.println("------");

        // Relatório para pessoa física
        RelatorioBuilder builderPessoa = new RelatorioPessoaFisicaBuilder();
        geradorRelatorio.construirRelatorio(builderPessoa);
        Relatorio relatorioPessoa = builderPessoa.getRelatorio();
        relatorioPessoa.exibir();

        /*
        O padrão Builder foi escolhido para construir os relatórios financeiros de forma flexível.
        Cada Builder concreto (BalancoPatrimonialBuilder, FluxoDeCaixaBuilder) define as etapas para construir um tipo específico de relatório.
        A classe GeradorRelatorio orquestra a construção, permitindo criar diferentes variações do relatório para diferentes tipos de clientes.
        Isso torna o código mais organizado e fácil de manter, além de facilitar a adição de novos tipos de relatórios.
         */

    }
}
