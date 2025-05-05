import java.util.List;

public class TermoCompleto extends Termo {
    private List<String> sinonimos;

    public TermoCompleto(String palavra, String traducao, List<String> sinonimos) {
        super(palavra, traducao);
        this.sinonimos = sinonimos;
    }

    public List<String> getSinonimos() {
        return sinonimos;
    }
}
