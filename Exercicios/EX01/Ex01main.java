package EX01;

public class Ex01main
{
    public static void main(String[] args)
    {
        ContaCorrente conta = new ContaCorrente(123,"Rudolph Silva");

        conta.depositar(100);

        conta.depositar(50);
        
        if(!conta.sacar(200))  // tenta sacar R$200,00, mas não consegue pois não tem saldo
            System.out.println("Saldo insuficiente");

        conta.definirLimite(100);

        if(!conta.sacar(200))
            System.out.println("Saldo insuficiente!");

        conta.consultaSaldo();

    }
}
