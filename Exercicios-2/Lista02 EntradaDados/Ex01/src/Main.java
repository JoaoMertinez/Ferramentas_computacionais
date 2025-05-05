import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Leitura;
        Leitura = new Scanner(System.in);

        int celsius;
        double fahre,kelvin,Rankine;
        System.out.printf("Digite a quantidade em graus celsisus: ");
        celsius = Leitura.nextInt();

        fahre = ((double) (celsius*9)/5) + 32;
        System.out.println("fahrenheit é :"+fahre);

        kelvin = (celsius + 273.15);
        System.out.println("Kelvin é:"+kelvin);

        Rankine = ((double) (celsius * 9)/5) + 491.67;
        System.out.printf("Rankine é: %.2f",Rankine);
    }
}