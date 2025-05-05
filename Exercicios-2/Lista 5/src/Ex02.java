import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter; // Importa a classe BufferedWriter para escrever em arquivos de forma mais eficiente.
import java.io.FileReader;
import java.io.BufferedReader; // Importa a classe BufferedReader para ler arquivos de forma mais eficiente.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        String mensagem;
        
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Definindo a formatação da data e hora
        String dataHoraFormatada = dataHora.format(formatoDataHora);

        System.out.println("Digite alguma mensagem: ");
        mensagem = leitura.nextLine();

        // Escreve a mensagem e a data/hora no arquivo texto
        try (FileWriter arqTexto = new FileWriter("mensagens.txt", true);
             BufferedWriter gravaArq = new BufferedWriter(arqTexto))
        {
            gravaArq.write(dataHoraFormatada + " --- " + mensagem);
            gravaArq.newLine();
            System.out.println("Mensagem armazenada com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro na gravação do arquivo: " + e.getMessage());
        }

        System.out.println("\nMensagens anteriores:");
        try (FileReader arquivoLeitura = new FileReader("mensagens.txt");
             BufferedReader leArq = new BufferedReader(arquivoLeitura)) {
            String linha;
            while ((linha = leArq.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }
    }
}