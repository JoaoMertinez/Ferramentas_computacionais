import java.util.List;

public class Main
{
   public static void main(String[] args)
   {
       Acervo meuacervo=new Acervo();
       CD cd=new CD("The Wall","Pink Floyd",1971);
       cd.addMusica(new Musica("Comfortable Numbly",8.5));
       // demais musicas
       meuacervo.addCD(cd);

       List<CD> cds = meuacervo.getCDs();
       for (CD cd1 : cds)
       {
           System.out.println(cd1.getTitulo());
           for(Musica m : cd1.getMusicas())
               System.out.println(m.getNome());
       }
   }
}