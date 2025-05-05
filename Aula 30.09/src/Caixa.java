import java.util.ArrayList;
import java.util.Date;

public class Caixa {
    private int id=100;
    private ArrayList<Comanda> comandas = new ArrayList<>();//colando em uma lista para procurar depois
    public Comanda nova(String Cliente) //contrutor para a comanda
    {
        Date data_atual = new Date();
        Comanda comanda_nova = new Comanda(this.id,data_atual,Cliente);
        this.id++;
        this.comandas.add(comanda_nova);
        return comanda_nova;
    }
    public Comanda getComanda(int id)
    {
        for (int i = 0; i < comandas.size() ; i++) {
            Comanda comanda_atual = comandas.get(i);
            if (id == comanda_atual.getId())
                return comanda_atual;
//            else
//                return null;
        }
        return null;
    }

    public String pagarComanda(int id) // atualizando o valor
    {
        for (int i = 0; i < comandas.size() ; i++) {
            Comanda comanda_atual = comandas.get(i);
            if (id == comanda_atual.getId())
            {
                double valor = comanda_atual.totalizar();
                comanda_atual.mudarStatus(); // classe a mais que fiz para atualizar a comanda e nao perder o valor, fiz mais para treino mesmo e resolvi manter no codigo

                return "Comanda " + id + " paga com sucesso. Valor: R$ " + valor + " volte sempre!!";
            }

        }
        return "comanda nao encontrata";
    }

}
