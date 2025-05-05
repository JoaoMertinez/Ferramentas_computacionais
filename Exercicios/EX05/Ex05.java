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

public class Ex05
{
    public static void main(String args[])
    {
        Gabarito gabarito = new Gabarito("AABBBACACACADDE");
        Prova prova = new Prova(gabarito);

        prova.respostaAluno("A"); 
        prova.respostaAluno("A"); 
        prova.respostaAluno("C"); 
        prova.respostaAluno("B"); 
        prova.respostaAluno("B"); 
        prova.respostaAluno("A"); 
        prova.respostaAluno("C"); 
        prova.respostaAluno("A"); 
        prova.respostaAluno("C"); 
        prova.respostaAluno("A"); 
        prova.respostaAluno("C"); 
        prova.respostaAluno("E"); 
        prova.respostaAluno("B"); 
        prova.respostaAluno("B"); 
        prova.respostaAluno("A"); 

        System.out.println("Você acertou "+prova.getAcertos()+" questões");
        System.out.println("Sua nota foi "+prova.getNota());
    }
}
