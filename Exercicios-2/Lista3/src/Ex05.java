import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plate;
        boolean isValid;

        System.out.println("Digite a placa: ");
        plate = scanner.nextLine();

        isValid = isValidPlate(plate);
        System.out.println(plate + " é uma placa válida? " + isValid);
    }

    public static boolean isValidPlate(String plate) {
        String pattern = "[A-Z]{3}-\\d{4}|[A-Z]{3}-\\d[A-Z]\\d{2}";
        return plate.matches(pattern);
    }
}

