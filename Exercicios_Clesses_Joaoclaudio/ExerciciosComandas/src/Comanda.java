import java.util.ArrayList;
import java.util.Date;
public class Comanda{
    private int Id,qtde;
    private Date data;
    private String cliente;
    private ArrayList<Produto> produtos;
    private String Status = "Nao paga";// professor coloquei essa classe aqui para ficar mais facil de verificar se foi paga ou nao

    public Comanda(int id, Date data, String cliente) {
        Id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void addItem(Produto produto,int qtde) {
        //this.produto = produto;
        this.produtos.add(produto);//adiciona no final da lista
        this.qtde = qtde;
    }
    public double totalizar()
    {
        double Resultado = 0;
//        this.produto;
        for (int i = 0; i < produtos.size() ; i++) {
         Produto produto_Atual = produtos.get(i);
         Resultado += produto_Atual.getPreco();
        }
        return Resultado;
    }

    public void mudarStatus() //classe a mais que eu coloquei
    {
        this.Status = "paga";
    }
}