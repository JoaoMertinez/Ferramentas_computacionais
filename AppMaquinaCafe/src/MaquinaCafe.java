public class MaquinaCafe {
    //atributos
    private double preco;
    private int totalCafesVendidos;
    private double valorDepositado;
    private double faturamento;
    //metodos
    public void setarPreco(double preco)
    {
       if(preco>=0 && ((int)(preco*100))%5==0)
           this.preco=preco;
    }
    public double obterPreco(){
        return preco;
    }
    public double obterValorDepositado()
    {
        return valorDepositado;
    }
    public int obterTotalCafesVendidos()
    {
        return totalCafesVendidos;
    }
    public double obterFaturamento()
    {
        return faturamento;
    }
    public void iniciar()
    {
        preco=0; totalCafesVendidos=0;
        valorDepositado=0;faturamento=0;
    }
    private boolean verificarMoeda(double moeda)
    {
        return moeda==0.05 || moeda==0.1 || moeda==0.25 || moeda==0.5 || moeda==1;
    }
    public boolean inserirMoeda (double moeda){
        if(verificarMoeda(moeda))
            valorDepositado+=moeda;
        return valorDepositado>=preco;
    }
    public double devolverTroco(){
        double troco=valorDepositado-preco;
        valorDepositado=0;
        registrarNovaVenda();
        return troco;
    }
    private void registrarNovaVenda() {
        totalCafesVendidos++;
        faturamento+=preco;
    }

}
