import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText;
        int wordCount = 0;

        System.out.println("Digite um texto ou frase:");
        inputText = scanner.nextLine();

        String[] parts = inputText.split("[ ,.]");

        for (String part : parts) {
            if (!part.isEmpty()) {
                wordCount++;
            }
        }

        System.out.println("Quantidade de palavras: " + wordCount);
        System.out.println("Quantidade de caracteres: " + inputText.length());
    }
}

