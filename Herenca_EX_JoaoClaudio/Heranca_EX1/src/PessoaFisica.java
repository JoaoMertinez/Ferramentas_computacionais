public class PessoaFisica extends Contribuinte {
    private String sexo;

    public PessoaFisica(String nome, String doc, double renda, String sexo) {
        super(nome, doc, renda);
        this.sexo = sexo;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;
        double renda = getRenda();

        if (renda <= 1400.00) {
            imposto = 0;
        } else if (renda <= 2100.00) {
            imposto = renda * 0.10 - 100;
        } else if (renda <= 2800.00) {
            imposto = renda * 0.15 - 270;
        } else if (renda <= 3600.00) {
            imposto = renda * 0.25 - 500;
        } else {
            imposto = renda * 0.30 - 700;
        }

        return Math.max(imposto, 0);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
