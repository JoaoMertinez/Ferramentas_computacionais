import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        TermoSimples gato = new TermoSimples("gato", "cat", "ket");
        TermoCompleto cachorro = new TermoCompleto("cachorro", "dog", Arrays.asList("cão", "canino", "perro"));

        dicionario.inserir(gato);
        dicionario.inserir(cachorro);

        System.out.println("Tradução de 'gato': " + dicionario.traduzir("gato"));
        System.out.println("Tradução de 'cachorro': " + dicionario.traduzir("cachorro"));

        dicionario.remover("gato");
        System.out.println("Tradução de 'gato' após remoção: " + dicionario.traduzir("gato"));
    }
}
