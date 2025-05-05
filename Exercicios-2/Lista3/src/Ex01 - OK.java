import java.util.Scanner;

public class Ex01 - OK {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = leitura.nextLine().toLowerCase();
        int contVogais = 0, contNum = 0;

        System.out.println("Tamanho: " + palavra.length());
        System.out.println("Maiúscula: " + palavra.toUpperCase());

        for (int i = 0; i < palavra.length(); i++) {
            char caracter = palavra.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
                contVogais++;
            else if (Character.isDigit(caracter))
                contNum++;
        }

        System.out.println("Nº de vogais: " + contVogais);
        if (palavra.startsWith("uno")) {
            System.out.println("A palavra começa por 'UNO'!!!");
        } else {
            System.out.println("A palavra não começa por 'UNO'!!!");
        }

        if (palavra.endsWith("ste")) {
            System.out.println("A palavra termina com 'STE'!!!");
        } else {
            System.out.println("A palavra não termina com 'STE'!!!");
        }
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("Quantidade de números: " + contNum);
        System.out.println(palavra.equals(palavraInvertida) ? "A palavra é Palíndromo" : "A palavra não é Palíndromo");
    }
}
