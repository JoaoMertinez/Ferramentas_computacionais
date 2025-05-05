public class TermoSimples extends Termo {
    private String pronunciacao;

    public TermoSimples(String palavra, String traducao, String pronunciacao) {
        super(palavra, traducao);
        this.pronunciacao = pronunciacao;
    }

    public String getPronunciacao() {
        return pronunciacao;
    }
}
