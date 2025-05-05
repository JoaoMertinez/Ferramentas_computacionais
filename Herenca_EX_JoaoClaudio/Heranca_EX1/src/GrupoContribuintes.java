import java.util.ArrayList;
import java.util.List;

public class GrupoContribuintes {
    private List<Contribuinte> contribuintes;

    public GrupoContribuintes() {
        contribuintes = new ArrayList<>();
    }

    public void adicionarContribuinte(Contribuinte contribuinte) {
        contribuintes.add(contribuinte);
    }

    public double totalImposto() {
        double total = 0;
        for (Contribuinte c : contribuintes) {
            total += c.calcularImposto();
        }
        return total;
    }

    public double porcentagemMulheres() {
        int totalMulheres = 0;
        for (Contribuinte c : contribuintes) {
            if (c instanceof PessoaFisica) {
                if (((PessoaFisica) c).getSexo().equalsIgnoreCase("Feminino")) {
                    totalMulheres++;
                }
            }
        }
        return (totalMulheres / (double) contribuintes.size()) * 100;
    }
}
