import java.util.Scanner;
import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        String palavra, embaralhada;
        char letras[];

        System.out.println("Digite uma palavra: ");
        palavra = leitura.nextLine();

        letras = palavra.toCharArray(); // Converte a palavra em um array de caracteres

        embaralhada = ""; // Inicializa a string da palavra embaralhada

        // Embaralhamento das letras
        for (int i = 0; i < letras.length; i++) {
            int indiceAleatorio = random.nextInt(letras.length);
            // Troca a letra na posição i pela letra na posição aleatória
            char temp = letras[i];
            letras[i] = letras[indiceAleatorio];
            letras[indiceAleatorio] = temp;
        }

        // Constrói a string da palavra embaralhada a partir do array de caracteres
        for (int i = 0; i < letras.length; i++)
            embaralhada += letras[i];

        // Exibe as palavras original e embaralhada
        System.out.println("Palavra sem estar embaralhada: " + palavra);
        System.out.println("Palavra embaralhada: " + embaralhada);
    }
}

