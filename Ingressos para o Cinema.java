package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int inteiras = sc.nextInt();
        int meias = sc.nextInt();
        sc.nextLine();

        String dia = sc.nextLine();
        String nacional = sc.nextLine();

        double total;

        if (nacional.equalsIgnoreCase("Sim")) {
            total = (inteiras + meias) * 5.00;
        } else if (dia.equalsIgnoreCase("Quarta-feira")) {
            total = (inteiras + meias) * 14.50;
        } else {
            total = (inteiras * 28.50) +
                    (meias * 14.25);
        }

        System.out.printf("Total à pagar: R$ %.2f%n", total);

        sc.close();
    }
}
