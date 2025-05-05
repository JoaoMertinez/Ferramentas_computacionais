import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MaquinaCafe mc;
        double moeda;
        mc=new MaquinaCafe();
        mc.iniciar();
        mc.setarPreco(1.50);
        do{
            JOptionPane.showMessageDialog(null,"Compre seu café por R$ "+mc.obterPreco());
            do {
                moeda = Double.parseDouble(JOptionPane.showInputDialog("Valor já depositado R$ "+
                        mc.obterValorDepositado()+"\nValor da moeda?"));
            }
            while(mc.inserirMoeda(moeda)==false);
            JOptionPane.showMessageDialog(null,"Pegue seu café\nPegue seu troco de R$ "
                    +mc.devolverTroco());
        }while(JOptionPane.showConfirmDialog(null,"Mais um cafézinho?")==JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null,"Total de cafés vendidos "+mc.obterTotalCafesVendidos());
        JOptionPane.showMessageDialog(null,"Total do faturamento R$ "+mc.obterFaturamento());

    }
}
