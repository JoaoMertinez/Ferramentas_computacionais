package Ex06;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Urna
{
    private int votos[];
    private String candidatos[];
    private int qtdeCandidatos;
    private String tpEleicao;

    //CONSTRUTORES
    public Urna(int qtdeCandidatos, String tipoEleicao)
    {
        this.candidatos = new String[qtdeCandidatos];
        this.votos = new int[qtdeCandidatos];
        this.tpEleicao = tipoEleicao;
        this.qtdeCandidatos = 0;
    }

    public void Urna(int qtdeCandidatos)
    {
        this.qtdeCandidatos = qtdeCandidatos;
    }

    public String getTipoEleicao()
    {
        return tpEleicao;
    }

    public void setTipoEleicao(String tpEleicao)
    {
        this.tpEleicao = tpEleicao;
    }

    
    public boolean adicCandidato(String nomeCandidato)
    {
        if(qtdeCandidatos < candidatos.length)  
        {
            candidatos[qtdeCandidatos] = nomeCandidato;
            qtdeCandidatos++;
            return true;
        }
        else 
            return false;
    }

    
    public String listaCandidatos()
    {
        String lista = "";

        for (int i = 0; i < qtdeCandidatos; i++) {
            lista += candidatos[i] + "\n";
        }
    
        return lista;
    }

    public void votar(int numCandidato)
    {
        if (numCandidato >= 0 && numCandidato < qtdeCandidatos)
            votos[numCandidato]++;
    }

    public void emitirBoletim()
    {
        try(RandomAccessFile arq = new RandomAccessFile("boletimUrna.txt", "rw"))
        {
            arq.setLength(0);
            arq.writeBytes(tpEleicao+"\n");

            double porc;

            int totalVotos = 0;
            for (int i = 0; i < qtdeCandidatos; i++)
                totalVotos += votos[i];

            for (int i = 0; i < qtdeCandidatos; i++)
            {
                porc = (votos[i] * 100.0) / totalVotos;
                arq.writeBytes("Candidato " + i + ": "+candidatos[i]+" "+votos[i]+" votos ("+String.format("%.1f",porc)+"%)\n");
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
