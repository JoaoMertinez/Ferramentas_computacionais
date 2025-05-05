package EX07;

import java.util.List;

public class Ex07
{
    public static void main(String args[])
    {
        todosClientes todClientes = new todosClientes();

        Cliente cliente1 = new Cliente(123, "João", "1234-5678", 1500.0);
        Cliente cliente2 = new Cliente(456, "Maria", "9876-5432", 2000.0);
        Cliente cliente3 = new Cliente(789, "Pedro", "5555-1234", 1800.0);

        todClientes.insere(cliente1);
        todClientes.insere(cliente2);
        todClientes.insere(cliente3);

        String listaClientes = todClientes.listaClientes();
        System.out.println("Clientes cadastrados: " + listaClientes);

        List<Cliente> clientesComRendaAlta = todClientes.buscaClientesPorRenda(1700.0);
        System.out.println("Clientes com renda superior a 1700.0:");
        for (Cliente cliente : clientesComRendaAlta)
            System.out.println(cliente);

        // Removendo o cliente com RG 456
        boolean removido = todClientes.exlcusao(456);
        if (removido == true)
            System.out.println("Cliente removido com sucesso!");
        else
            System.out.println("Cliente não encontrado.");
    }
}
