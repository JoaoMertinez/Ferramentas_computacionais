public class InversorDeArquivo {

    public static void inverterArquivo(String nomeArquivo) {
        File arquivoOriginal = new File(nomeArquivo);
        File arquivoInvertido = new File("inverso.txt");

        try {
            // Abre o arquivo original para leitura
            RandomAccessFile arq1 = new RandomAccessFile(arquivoOriginal, "r");
            // Cria o arquivo invertido para escrita
            FileOutputStream arqinvertido = new FileOutputStream(arquivoInvertido);

            long tamanhoArquivo = arq1.length(); // Obtém o tamanho do arquivo

            // Lê o arquivo de trás para frente e escreve no novo arquivo
            for (long i = tamanhoArquivo - 1; i >= 0; i--) {
                arq1.seek(i); // Move o ponteiro para a posição i
                int b = arq1.read(); // Lê o byte na posição i
                arqinvertido.write(b); // Escreve o byte no novo arquivo
            }

            // Fecha os arquivos
            arq1.close();
            arqinvertido.close();

            System.out.println("Arquivo invertido criado com sucesso: " + arquivoInvertido.getAbsolutePath());
        } catch (IOException e) {
            // Em caso de erro, exibe a mensagem de erro
            System.out.println("Erro ao inverter o arquivo: " + e.getMessage());
        }
    }


    public class Ponto {
        // Atributos privados para coordenadas x e y
        private double x;
        private double y;

        // Construtor para inicializar as coordenadas
        public Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Método get para a coordenada x
        public double getX() {
            return x;
        }

        // Método set para a coordenada x
        public void setX(double x) {
            this.x = x;
        }

        // Método get para a coordenada y
        public double getY() {
            return y;
        }

        // Método set para a coordenada y
        public void setY(double y) {
            this.y = y;
        }




