package EX05;

/*
    Gabarito gabarito=new Gabarito("AABBBACACACADDE"); //cria um gabarito com as respostas corretas
    Prova prova=new Prova(gabarito);
    prova.respostaAluno("A"); //primeira resposta
    prova.respostaAluno("A"); //segunda resposta
    //... insere mais respostas
    prova.respostaAluno("D"); //última resposta (15ª), a partir desse ponto não aceite mais respostas
    System.out.println("Você acertou "+prova.getAcertos()+" questões");
    System.out.println("Sua nota foi "+prova.getNota());
 */

public class Prova
{
    private Gabarito gabarito;
    private char respostaAluno[];
    private int index;

    //CONSTRUTOR
    public Prova(Gabarito gabarito)
    {
        this.gabarito = gabarito;
        this.respostaAluno = new char[15];
        this.index = 0;
    }

    //METODOS
    public void respostaAluno(String resposta)
    {
        if(index < 15)
        {
            respostaAluno[index] = resposta.charAt(0);
            index++;
        }
        else
            System.out.println("Questão digitada é invalida!");
    }

    public int getAcertos()
    {
        int acertos = 0;

        for(int i=0; i < 15; i++)
        {
            if(respostaAluno[i] == gabarito.respostasQuestao(i + 1))
                acertos++;
        }
        return acertos;
    }

    public double getNota()
    {
        double nota=0;

        for(int i=0; i < 15; i++)
        {
            if(respostaAluno[i] == gabarito.respostasQuestao(i + 1))
            {
                if(i < 10)
                    nota = nota + 0.5;
                else
                    nota = nota + 1.0;
            }

        }
        return nota;
    }

    
}
