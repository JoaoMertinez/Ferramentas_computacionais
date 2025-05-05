public abstract class Contribuinte implements ITributacao {
    private String nome;
    private String doc;
    private double renda;

    public Contribuinte(String nome, String doc, double renda) {
        this.nome = nome;
        this.doc = doc;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
