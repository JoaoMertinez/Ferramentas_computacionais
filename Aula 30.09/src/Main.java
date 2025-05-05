//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Tipo tipo1=new Tipo("bebida");
        Tipo tipo2=new Tipo("salgados");

        Produto[] estoque=new Produto[3];
        estoque[0]=new Produto(1,"coca cola 300ml",4.5,90,tipo1);
        estoque[1]=new Produto(2,"suco limão",6.5,10,tipo1);
        estoque[2]=new Produto(3,"Quibe",8.0,10,tipo2);

    //Criando e instanciando o Caixa
        Caixa caixa=new Caixa();

    // Criando e gerenciando uma Comanda
        Comanda comanda1 = caixa.nova("Flavio");
        comanda1.addItem(estoque[0],2); //adiona o produto da posicao zero
        comanda1.addItem(estoque[2],1);

    // Pagando a comanda
        Comanda aux=caixa.getComanda(100);
        double total=aux.totalizar();
        System.out.println("Você deve R$"+total);
        System.out.println(caixa.pagarComanda(100));
        System.out.println();

    }
}