package Ex06;

public class Ex06
{
    public static void main(String args[])
    {
        Urna u1 = new Urna(3,"Eleição para o DA");
        
        u1.adicCandidato("Pelé");
        u1.adicCandidato("Maradona");
        u1.adicCandidato("Ronaldo");

        System.out.println(u1.listaCandidatos());
        u1.votar(0);
        u1.votar(0);
        u1.votar(2);

        u1.emitirBoletim();
    }
    
}
