package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String curso = sc.nextLine().toUpperCase();
        String isento = sc.nextLine();
        double desconto = sc.nextDouble();

        double mensalidade = 0;

        switch (curso) {
            case "SI":
                mensalidade = 900;
                break;
            case "ADS":
                mensalidade = 750;
                break;
            case "CS":
                mensalidade = 1150;
                break;
            case "EC":
                mensalidade = 1300;
                break;
            case "ES":
                mensalidade = 950;
                break;
            default:
                System.out.println("Curso não encontrado");
                sc.close();
                return;
        }

        if (isento.equalsIgnoreCase("Sim")) {
            mensalidade = 0;
        } else {
            mensalidade = mensalidade -
                    (mensalidade * desconto / 100);
        }

        System.out.printf("Valor da mensalidade: R$ %.2f%n",
                mensalidade);

        sc.close();
    }
}
