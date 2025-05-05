import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long numero, milhar=0, centena=0, dezena=0, unidade=0, somaTotal;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 4 dígitos ou digite 0 para sair:");
        numero = leitura.nextLong();

        while(numero != 0) {
            if(numero > 999 && numero < 10000) {
                milhar = numero / 1000;
                centena = (numero - (milhar * 1000)) / 100;
                dezena = (numero - ((milhar * 1000 + centena * 100))) / 10;
                unidade = (numero - ((milhar * 1000 + centena * 100) + dezena * 10));
                somaTotal = (centena + milhar + dezena + unidade);
                System.out.println("A soma dos dígitos desse número é: " + somaTotal);
            } else {
                System.out.println("Número fora da validação de 4 dígitos!");
            }
            System.out.println("Digite outro número inteiro de 4 dígitos ou digite 0 para sair:");
            numero = leitura.nextLong();
        }
        System.out.println("Programa encerrado.");
    }
}
