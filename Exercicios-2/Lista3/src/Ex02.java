import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome, iniciais = "";

        System.out.println("Digite seu nome completo: ");
        nome = leitura.nextLine();

        String conectivas[] = {"e", "do", "da", "dos", "das", "de", "di"};
        String nomeParte[] = nome.split(" ");

        for (String parte : nomeParte) {
            if (!parte.isEmpty() && !Conectivas(parte, conectivas))
                iniciais += Character.toUpperCase(parte.charAt(0));
        }

        System.out.println("Iniciais do seu nome: " + iniciais);
    }

    public static boolean Conectivas(String palavra, String[] conectivas) {
        for (String conectiva : conectivas) {
            if (palavra.equalsIgnoreCase(conectiva))
                return true;
        }
        return false;
    }
}

