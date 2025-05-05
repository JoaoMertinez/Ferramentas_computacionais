import java.io.RandomAccessFile;
import java.io.File;
import javax.swing.*;
import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        //Solicitar ao usuário o diretório e a palavra-chave
        Scanner leString = new Scanner(System.in);
        JFileChooser leitura = new JFileChooser();
        leitura.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resultado = leitura.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION)
        {
            File local = leitura.getSelectedFile();

            System.out.println("Digite a palavara chave: ");
            String palavraChave = leString.nextLine();

            // Realizar a busca nos arquivos do diretório
            buscaPalavraChave(local,palavraChave);
        }
        else
        {
            System.out.println("Erro na abertura do arquivo");
        }
    }

    public static void buscaPalavraChave(File directory, String palavraChave)
    {
        File[] files = directory.listFiles();
        if (files != null)
        {
            for (File file : files)
            {
                if (file.isDirectory())
                    // Recursivamente busca em subdiretórios
                    buscaPalavraChave(file, palavraChave);
                else
                if (file.isFile() && isArquivoCodigoFonte(file))
                {
                    // Realiza a busca no arquivo de código fonte
                    if (buscarPalavraChaveNoArq(file, palavraChave))
                        System.out.println("Palavra-chave encontrada em: "+file.getAbsolutePath());
                    else
                        System.out.println("A palavra chave não foi encontrada!");
                }
            }
        }
        else
        {
            System.out.println("Não existe arquivos dentro da pasta!");
        }
    }

    public static boolean isArquivoCodigoFonte(File file)
    {
        String nomenclaturaArq = file.getName();
        return nomenclaturaArq.endsWith(".cpp") || nomenclaturaArq.endsWith(".java") || nomenclaturaArq.endsWith(".py") || nomenclaturaArq.endsWith(".js");
    }

    public static boolean buscarPalavraChaveNoArq(File file, String palavraChave)
    {
        try(RandomAccessFile referencia = new RandomAccessFile(file, "r"))
        {
            String linha;
            while ((linha = referencia.readLine()) != null)
            {
                if (linha.contains(palavraChave))
                    return true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
}