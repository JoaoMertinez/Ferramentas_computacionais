import java.util.ArrayList;
import java.util.List;

public class CD
{
    private String titulo;
    private String artista;
    private int ano;
    List<Musica> musicas;

    public CD(String titulo, String artista, int ano)
    {
        this.titulo = titulo;
        this.artista = artista;
        setAno(ano);
        musicas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>0)
            this.ano = ano;
    }

    public CD()
    {
        this("","",0);
    }//??
    public void addMusica (Musica musica)
    {
        musicas.add(musica);
    }
    public List<Musica> getMusicas()
    {
        return musicas;
    }
}
