package EX03;

/*
    A linguagem Java dispõe de um suporte nativo a vetores, que exige a definição de seu tamanho no momento da instanciação.
    Depois de instanciado, o tamanho do vetor não pode ser modificado.
    Escreva uma classe chamada MeuVetor cujos objetos simulem vetores de tamanho variável. A classe define os seguintes métodos:
    
    construtor: recebe como parâmetro o tamanho inicial do vetor.

    insert: recebe como parâmetro uma string e a coloca na próxima posição disponível do vetor; note que o vetor cresce
    automaticamente, portanto, se a inserção ultrapassar o tamanho inicial estabelecido na criação, por exemplo, o vetor
    deve aumentar seu tamanho automaticamente. Crie uma algoritmo para redimensionar um vetor de forma a não perder seus valores.
    
    get: recebe como parâmetro uma posição do vetor e retorna a string que estiver naquela posição; se a posição não estiver
    ocupada ou ultrapassar o tamanho do vetor, este método retorna nulo.
    
    get: não recebe parâmetros, retorna o último elemento inserido no vetor, retorna nulo caso o vetor esteja vazio.
    
    size: retorna o número de elementos inseridos no vetor (independente do tamanho físico do mesmo)  

    MeuVetor meuVetor=new MeuVetor(3); //vetor com no máximo 3 elementos
    meuVetor.inserir("banana"); //insere primeiro elemento
    meuVetor.inserir("uva"); //insere segundo elemento
    meuVetor.inserir("carambola"); //insere terceiro elemento
    meuVetor.inserir("mexerica"); //insere quarto elemento e aumenta a capacidade do vetor para 4 elementos
    System.out.println(meuvetor.get(1));//imprime "uva"
    System.out.println(meuvetor.get());//imprime "mexerica"
    System.out.println("O vetor tem "+meuvetor.size()+" elementos");
    // imprime "O vetor tem 4 elementos"
*/

public class Ex03
{
    public static void main(String args[])
    {
        MeuVetor meuVetor = new MeuVetor(3);

        meuVetor.inserir("banana"); //insere primeiro elemento
        meuVetor.inserir("uva"); //insere segundo elemento
        meuVetor.inserir("carambola"); //insere terceiro elemento
        meuVetor.inserir("mexerica"); //insere quarto elemento e aumenta a capacidade do vetor para 4 elementos
        System.out.println(meuVetor.get(1));//imprime "uva"
        System.out.println(meuVetor.get());//imprime "mexerica"
        System.out.println("O vetor tem "+meuVetor.size()+" elementos");

    }
}
