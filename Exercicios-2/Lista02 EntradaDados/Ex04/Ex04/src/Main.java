import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double xa,xb,ya,yb,tot;

        System.out.println("Digite o 'XA':");
        xa = leitura.nextDouble();

        System.out.println("Digite o 'XB':");
        xb = leitura.nextDouble();

        System.out.println("Digite o 'YA':");
        ya = leitura.nextDouble();

        System.out.println("Digite o 'YB':");
        yb = leitura.nextDouble();


       tot = Math.sqrt(java.lang.Math.pow((xb - xa),2) + java.lang.Math.pow((yb - ya),2));//calculando o plano cartesiano

        System.out.printf("Valor total da operação é: %.2f\n",tot);
        System.out.println("Ou\nValor total da operação é: "+tot);
    }
}