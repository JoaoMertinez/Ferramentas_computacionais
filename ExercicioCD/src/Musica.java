public class Musica
{
    private String nome;
    private double tempo;

    public Musica(String nome, double tempo)
    {
        this.nome = nome;
        this.tempo = tempo;
    }

    public Musica()
    {
        this("",0);
    }

    public String getNome()
    {
        return nome;
    }

    public double getTempo()
    {
        return tempo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setTempo(double tempo)
    {
        this.tempo = tempo;
    }
}
