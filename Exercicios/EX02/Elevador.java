package EX02;
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // CONSTRUTOR
    public Elevador(int andarAtual, int totalAndares, int capacidade) {
        if (andarAtual < 0 || andarAtual > totalAndares) {
            throw new IllegalArgumentException("Andar atual inválido.");
        }
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    // GETS
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    // SETS
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    // MÉTODOS
    public boolean entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            return true;
        } else {
            return false;
        }
    }

    public boolean sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return true;
        } else {
            return false;
        }
    }

    public boolean subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            return true;
        } else {
            return false;
        }
    }

    public boolean descer() {
        if (andarAtual > 0) {
            andarAtual--;
            return true;
        } else {
            return false;
        }
    }
}