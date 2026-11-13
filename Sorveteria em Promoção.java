package dobackofront;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gramas = sc.nextDouble();
        double total;

        if (gramas <= 0) {
            System.out.println("Peso inválido");
        } else {
            if (gramas >= 1000) {
                total = (gramas / 100) * 3.00;
            } else {
                total = (gramas / 100) * 3.50;
            }

            System.out.printf("O total é R$ %.2f%n", total);
        }

        sc.close();
    }
}
