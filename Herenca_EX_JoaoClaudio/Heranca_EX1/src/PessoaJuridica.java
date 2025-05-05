public class PessoaJuridica extends Contribuinte {
    private int anoFundacao;

    public PessoaJuridica(String nome, String doc, double renda, int anoFundacao) {
        super(nome, doc, renda);
        this.anoFundacao = anoFundacao;
    }

    @Override
    public double calcularImposto() {
        return getRenda() * 0.10;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}
