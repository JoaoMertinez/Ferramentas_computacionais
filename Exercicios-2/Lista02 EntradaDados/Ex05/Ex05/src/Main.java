import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        float valor = 0;
        int inteiro, centena = 0, vinte = 0, dezena = 0, cinco = 0, um = 0, vinteCincoCentavos = 0, dezCentavos = 0;

        System.out.println("Digite um valor em reais (xx,xx):");
        valor = leitura.nextFloat();

        if (valor > 0) {
            inteiro = (int) valor;
            float centavos = valor - inteiro;
            centena = inteiro / 100;
            inteiro = inteiro % 100;

            vinte = inteiro / 20;
            inteiro = inteiro % 20;

            dezena = inteiro / 10;
            inteiro = inteiro % 10;

            cinco = inteiro / 5;
            inteiro = inteiro % 5;

            um = inteiro;

            vinteCincoCentavos = (int) (centavos * 100) / 25;
            centavos = centavos - (vinteCincoCentavos * 0.25f);

            dezCentavos = (int) (centavos * 100) / 10;

            System.out.printf("Valor do saque: R$%.2f\n", valor);
            System.out.println("O valor do saque pode ser expresso em:");
            System.out.println("\tNota(s) de 100: " + centena);
            System.out.println("\tNota(s) de 20: " + vinte);
            System.out.println("\tNota(s) de 10: " + dezena);
            System.out.println("\tNota(s) de 5: " + cinco);
            System.out.println("\tMoeda(s) de 1 real: " + um);
            System.out.println("\tMoeda(s) de 25 centavos: " + vinteCincoCentavos);
            System.out.println("\tMoeda(s) de 10 centavos: " + dezCentavos);
        } else {
            System.out.println("Valor inválido!");
        }
    }
}


