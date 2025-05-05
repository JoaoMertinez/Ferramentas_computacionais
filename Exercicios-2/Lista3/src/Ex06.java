import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        Random random = new Random();
        String name = "";
        int i, j, size;
        char character;

        System.out.println("Nomes aleatórios: ");

        for (i = 0; i < 5; i++) {
            size = random.nextInt(3) * 2 + 4;
            System.out.printf("O numero selecionado foi o: %d", size);

            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

            for (j = 0; j < size; j++) {
                if (j % 2 == 0)
                    character = consonants[random.nextInt(consonants.length)];
                else
                    character = vowels[random.nextInt(vowels.length)];
                name += character;
            }

            System.out.println(name);
            name = ""; // Limpa a string para o próximo nome
        }
    }
}
