public class Main {
    public static void main(String[] args) {
        GrupoContribuintes grupo = new GrupoContribuintes();

        grupo.adicionarContribuinte(new PessoaFisica("Joao", "123.456.789-00", 2500.00, "Masculino"));
        grupo.adicionarContribuinte(new PessoaFisica("Maria", "987.654.321-00", 3500.00, "Feminino"));
        grupo.adicionarContribuinte(new PessoaJuridica("Empresa", "12.345.678/0001-00", 50000.00, 2000));

        System.out.println("Total de imposto devido: R$ " + grupo.totalImposto());
        System.out.println("Porcentagem de contribuintes do sexo feminino: " + grupo.porcentagemMulheres() + "%");
    }
}