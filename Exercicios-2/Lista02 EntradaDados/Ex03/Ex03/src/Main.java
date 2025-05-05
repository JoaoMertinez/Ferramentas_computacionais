import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int ano, idade;

        LocalDate localDate = LocalDate.now();
        System.out.println("Digite o ano de nascimento ou digite 0 para sair:");
        ano = leitura.nextInt();

        while (ano != 0) {
            idade = localDate.getYear() - ano;
            System.out.println("Sua idade é: " + idade);
            System.out.println("Digite o ano de nascimento ou digite 0 para sair:");
            ano = leitura.nextInt();
        }
        System.out.println("Programa encerrado.");
    }
}
