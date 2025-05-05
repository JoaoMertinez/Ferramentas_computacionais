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

public class Gabarito
{
    private String resposta;
    
    //CONSTRUTOR
    public Gabarito(String resposta)
    {
        this.resposta = resposta;
    }

    //METODO
    public char respostasQuestao(int numQuestao)
    {
        if(numQuestao > 0 && numQuestao <=15)
            return resposta.charAt(numQuestao - 1);
        else
        {
            System.out.println("Questão digitada é invalida!");
            return '\0';
        }
    }


}
