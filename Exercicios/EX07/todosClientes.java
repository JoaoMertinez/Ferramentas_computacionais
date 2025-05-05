package EX07;

import java.util.ArrayList;
import java.util.List;

/*
    Crie a classe TodosClientes contendo:
    a) um atributo clientes que é um ArrayList de Cliente.
    b) Construtor: que instancia o ArrayList.
    c) métodos  void insere(Cliente c) e  String listaClientes(). O primeiro recebe um objeto do tipo Cliente e o insere no array.
    O segundo retorna uma String com uma relação de todos os nomes de clientes cadastrados, separados por vírgulas.
    Ex: “Paulo da Silva, Arthur Moreira, Cristina Melo”
    d) o método List<Cliente> buscaClientesPorRenda(double renda). Que retorna um ArrayList  contendo todos os  clientes que possuem
    renda superior à renda enviada como parâmetro. Caso o parâmetro seja o valor -1, todos os clientes serão retornados.
    e) o método boolean remove(int rg) que remove o Cliente do ArrayList que possui determinado rg.
 */

public class todosClientes
{
    private List<Cliente> clientes;

    //CONSTRUTOR
    public todosClientes()
    {
        clientes = new ArrayList<>();
    }

    //METODOS
    public void insere(Cliente c)
    {
        clientes.add(c);
    }

    public String listaClientes()
    {
        String lista = "";
        for (Cliente cliente : clientes)
            lista += cliente.getNome() + ", "; // Concatenando os nomes dos clientes com vírgula
    
        if (!lista.isEmpty())
            lista = lista.substring(0, lista.length() - 2); // Removendo a vírgula extra no final
    
        return lista;
    }

    public List<Cliente> buscaClientesPorRenda(double renda)
    {
        List<Cliente> encontrados = new ArrayList<>();
        for(Cliente cliente : clientes)
        {
            if (renda == -1 || cliente.getRenda() > renda)
                    encontrados.add(cliente);
        }
        return encontrados;
    }
    
    public boolean exlcusao(int rg)
    {
        for (Cliente cliente : clientes)
        {
            if (cliente.getRg() == rg)
            {
                clientes.remove(cliente);
                 return true;
            }
        }
         return false;
    }


}
