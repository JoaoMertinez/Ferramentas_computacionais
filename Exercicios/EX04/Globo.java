package EX04;

import java.util.Random;

/*
    Desenvolva uma classe para representar um globo utilizado nos jogos de bingo. O Globo deverá ao ser inicializado fornecer números entre 1 e um valor máximo, de forma aleatória e não repetidos. No projeto da classe, defina construtores, métodos gets, sets e demais métodos.  
 
    Globo globo;
    globo =new Globo(60); //cria um globo com 60 números, do 1 ao 60
    int num = globo.getNumero(); //retira um numero sorteado do globo
    System.out.println("Quantidade de números restantes: "+globo.getTotalNumerosRestantes());
    // imprime "Quantidade de números restantes: 59"
 */

public class Globo
{
    private int numeros[];
    private int totalNumeros;
    private int indice;

    //CONSTRUTOR
    public Globo(int maxNumeros)
    {
        this.totalNumeros = maxNumeros;
        this.numeros = new int[maxNumeros];
        this.indice = 0;

        //inicializar array colocando os numeros em sequencia
        for(int i=0; i<maxNumeros; i++)
            numeros[i] = i + 1;
        
        //chamdando o metodo de embaralhar esse numeros
        embaralharNumeros();
    }

    //METODOS
    public void embaralharNumeros()
    {
        Random embaralhar = new Random();

        for(int i=numeros.length-1; i>0; i--)
        {
            int j = embaralhar.nextInt(i+1);
            //trocando os valores de lugar para embaralhar
            int aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
        }
    }

    public int getNumero(int numero)
    {
        if(indice < totalNumeros)
            return numeros[indice++];
        else
        {
            System.out.println("Todos os numeros já foram sorteados!");
            return -1;
        }
    }

    public int getTotalNumerosRestantes()
    {
        return totalNumeros - indice;
    }

}
