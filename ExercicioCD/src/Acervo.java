import java.util.ArrayList;

public class Acervo {

    private ArrayList<CD> meu_acervo = new ArrayList();
    public void addCD(CD cd){
        meu_acervo.add(cd);
    }
    public ArrayList getCDs(){
        return meu_acervo;
    }
}
