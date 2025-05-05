import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Ex04 {

    public static void main(String[] args) {//coloquei um JFileChooser para treinar
        // Cria um JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        //String inputFile = "cidades.txt";

        // Configura para aceitar apenas arquivos de texto para a entrada
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Selecione o arquivo de texto das cidades");

        // Mostra o diálogo para o usuário escolher o arquivo de entrada
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            String inputFile = fileChooser.getSelectedFile().getAbsolutePath();

            // Obtém o diretório do arquivo de entrada
            String inputDir = new File(inputFile).getParent();

            // Define o caminho do arquivo de saída na mesma pasta que o arquivo de entrada
            String outputFile = inputDir + File.separator + "cidades.html";

            converteHTML(inputFile, outputFile);
        } else {
            System.out.println("Operação cancelada pelo usuário!");
        }
    }

    public static void converteHTML(String inputFile, String outputFile) {
        try (BufferedReader ler = Files.newBufferedReader(Paths.get(inputFile));//criando os objetos de ler e escrever, e recomendado quando vai ler o arq INTEIRO
             BufferedWriter escreve = Files.newBufferedWriter(Paths.get(outputFile))) {

            escreve.write("<!DOCTYPE html>\n");
            escreve.write("<html lang=\"pt-br\">\n");
            escreve.write("  <head>\n");
            escreve.write("    <title>Cidades do Estado de Sao Paulo</title>\n");
            escreve.write("  </head>\n");
            escreve.write("  <body>\n");

            //^ jogando dentro do arquivo as linhas que o navegador intende

            String linhaAtual;// para ficar mais facil de manipular
            char finalcaracter = 0; // definindo como NULO

            while ((linhaAtual = ler.readLine()) != null) {//quando retorna null caba o arquivo
                if (linhaAtual.isEmpty()) continue;
                char Letrainicial = Character.toUpperCase(linhaAtual.charAt(0));//jogando a primeira LETRA como maiuscula

                if (Letrainicial != finalcaracter) {//vendo se o começo nao é igual a 0/null
                    escreve.write("    <h1>" + Letrainicial + "</h1>\n");
                    finalcaracter = Letrainicial;
                }

                escreve.write("    <p>" + linhaAtual + "</p>\n");
            }

            escreve.write("  </body>\n");
            escreve.write("</html>\n");
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {// em pesquisas vi que esse metodo tambem pode ser usado
            e.printStackTrace();
        }
    }
}
