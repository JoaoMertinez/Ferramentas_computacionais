package EX02;

public class Ex02
{
    public static void main(String args[])
    {
        Elevador elevador = new Elevador(8,15);

        elevador.entrar();
        elevador.entrar();
        if(!elevador.entrar())
            System.out.println("Capacidade excedida!");
        
        elevador.subir();
        if(!elevador.subir())
            System.out.println("O elevador já se encontra no ultimo andar!");
        
        elevador.sair();
        System.out.println("Andar atual do elavador: "+elevador.getAndarAtual());
        System.out.println("Quantidade total de pessoas dentro do elevador: "+elevador.getPessoasPresentes());


    }
}
