import java.io.RandomAccessFile;

public class Main {
    private static void leituraByteByte()
    {
        RandomAccessFile arq;
        try {
            arq = new RandomAccessFile("c:\\dev-cpp\\news.txt", "r");
            char car;
            while(arq.getFilePointer() < arq.length()){
                car=(char)arq.readByte();
                System.out.print(car);
            }
            arq.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static void leituraLinhaLinha()
    {
        RandomAccessFile arq;
        try {
            arq = new RandomAccessFile("c:\\dev-cpp\\news.txt", "r");
            String linha;
            while(arq.getFilePointer() < arq.length()){
                linha=arq.readLine();
                if(linha.toUpperCase().contains("WINDOW"))
                    System.out.println(linha.toUpperCase());
            }
            arq.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        RandomAccessFile arq,arqw;
        try {
           arq = new RandomAccessFile("c:\\dev-cpp\\news.txt", "r");
           arqw = new RandomAccessFile("novo.txt","rw");
           arqw.setLength(0);
           String studo;
           byte[] bytes=new byte[(int)arq.length()];
           arq.readFully(bytes);
           studo=new String(bytes);
           arqw.writeBytes(studo.toUpperCase());
           arq.close();
           arqw.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}