public class Produto {

    private int Idp, estoque;
    private String nomeP;
    private double preco;
    private  Tipo tipo;

    public Produto(int idp, String nomeP, Double preco, int estoque, Tipo tipo1) {
        Idp = idp;
        setPreco(preco);
        this.nomeP = nomeP;
        this.tipo = tipo1;
//        this.estoque = estoque;
        setEstoque(estoque);
    }
    public int getIdp() {
        return Idp;
    }
    public void setIdp(int idp) {
        Idp = idp;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        if (estoque>0)
            this.estoque = estoque;
    }

    public String getNomeP() {
        return nomeP;
    }
    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco>0)
            this.preco = preco;
    }
}