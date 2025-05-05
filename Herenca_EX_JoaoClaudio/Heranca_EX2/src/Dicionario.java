import java.util.ArrayList;
import java.util.List;

public class Dicionario implements IDic {
    private List<Termo> termos;

    public Dicionario() {
        termos = new ArrayList<>();
    }

    @Override
    public void inserir(Termo termo) {
        termos.add(termo);
    }

    @Override
    public String traduzir(String palavra) {
        for (Termo termo : termos) {
            if (termo.getPalavra().equalsIgnoreCase(palavra)) {
                return termo.getTraducao();
            }
        }
        return "Palavra nao encontrada.";
    }

    @Override
    public boolean remover(String palavra) {
        return termos.removeIf(termo -> termo.getPalavra().equalsIgnoreCase(palavra));
    }
}
