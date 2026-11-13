package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ganhos = sc.nextDouble();
        double gastos = sc.nextDouble();

        if (ganhos >= gastos) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Você está fora do orçamento! Não gaste mais!");
        }

        sc.close();
    }
}
