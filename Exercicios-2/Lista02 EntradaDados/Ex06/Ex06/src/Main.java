import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double emprestimo, parcela, juros;
        int quant;

        System.out.println("Digite o valor do empréstimo:");
        emprestimo = leitura.nextDouble();

        System.out.println("Digite a quantidade das parcelas:");
        quant = leitura.nextInt();

        System.out.println("Digite a porcentagem dos juros:");
        juros = leitura.nextDouble();

        juros = juros / 100.0;

        parcela = emprestimo * (juros * Math.pow(1 + juros, quant)) / (Math.pow(1 + juros, quant) - 1);

        System.out.println("\tAmortização no sistema Francês de Amortização (Tabela Price)");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Montante Financiado : R$%.2f%n", emprestimo);
        System.out.printf("Juros Financiamento : %.2f %% %n", juros * 100);
        System.out.printf("Nº de Parcelas : %d%n", quant);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Parcela \t Vlr Parcela \t Amortização \t Juros \t\t Sdo Devedor");

        double saldoDevedor = emprestimo;
        double totalJuros = 0;

        for (int i = 1; i <= quant; i++) {
            double jurosParcela = saldoDevedor * juros;
            double amortizacao = parcela - jurosParcela;
            saldoDevedor -= amortizacao;

            totalJuros += jurosParcela;

            System.out.printf("Nº %d \t %.2f \t\t %.2f \t\t %.2f \t\t %.2f%n", i, parcela, amortizacao, jurosParcela, saldoDevedor);
        }

        System.out.printf("Total de juros pago: R$ %.2f%n", totalJuros);
        System.out.println("--------------------------------------------------------------");
    }
}
