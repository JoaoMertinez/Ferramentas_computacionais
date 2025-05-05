package EX01;

public class ContaCorrente {
    private int numConta;
    private String nomeTitular;
    private double saldoConta;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = 0.0;
        this.especial = false;
        this.limite = 0.0;
    }

    // Métodos de acesso aos atributos
    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    // Métodos de operações da conta
    public void depositar(double valor) {
        if (valor > 0)
            saldoConta += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0)
            return false;

        // Verifica se a conta possui limite especial antes de permitir o saque
        if (!especial && valor > saldoConta) {
            return false;
        }

        saldoConta -= valor;
        return true;
    }

    public void definirLimite(double limite) {
        if (limite > 0) {
            especial = true;
            this.limite = limite;
        }
    }

    public boolean chequeEspecial() {
        return saldoConta < 0;
    }

    public void consultaSaldo() {
        System.out.println("Saldo da conta de " + nomeTitular + " é R$" + saldoConta + " com limite de R$" + limite);
    }
}
