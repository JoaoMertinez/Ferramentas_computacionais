package EX07;

/*
    Crie a classe Cliente contendo:
    a) Os atributos rg (tipo int), nome (tipo String), fone (tipo String) e renda (tipo double).
    b) Dois construtores: um sem parâmetros e outro com os parâmetros rg, nome, fone e renda.
    c) Métodos getters e setters para os atributos rg, nome, fone e renda.
    d) Método toString() para retornar uma String que é a concatenação dos atributos da classe.

    Ex: “20374444 Paulo da Silva 3222-5599 1000.50”
 */

public class Cliente
{
    private int rg;
    private String nome;
    private String fone;
    private double renda;

    //CONSTRUTORES
    public Cliente()
    {
        this.rg = 0;
        this.nome = "";
        this.fone = "";
        this.renda = 0.0;
    }

    public Cliente(int rg, String nome, String fone, double renda)
    {
        this.rg = rg;
        this.nome = nome;
        this.fone = fone;
        this.renda = renda;
    }

    //METODOS GETTERS E SETTERS
    public void setRg(int rg)
    {
        this.rg = rg;
    }

    public int getRg()
    {
        return rg;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setFone(String fone)
    {
        this.fone = fone;
    }

    public String getFone()
    {
        return fone;
    }

    public void setRenda(double renda)
    {
        this.renda = renda;
    }

    public double getRenda()
    {
        return renda;
    }

    //METODO
    public String toString()
    {
        return rg + "" + nome + "" + fone + "" + renda + "";
    }
}
