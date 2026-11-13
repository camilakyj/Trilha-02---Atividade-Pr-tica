package dobackofront;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cor1 = sc.nextLine().toLowerCase();
        String cor2 = sc.nextLine().toLowerCase();

        boolean primaria1 = cor1.equals("vermelho") ||
                cor1.equals("azul") ||
                cor1.equals("amarelo");

        boolean primaria2 = cor2.equals("vermelho") ||
                cor2.equals("azul") ||
                cor2.equals("amarelo");

        if (!primaria1 || !primaria2) {
            System.out.println("Apenas cores primárias são aceitas.");
        } else {
            String resultado;

            if (cor1.equals(cor2)) {
                resultado = cor1;
            } else if ((cor1.equals("vermelho") && cor2.equals("azul")) ||
                    (cor1.equals("azul") && cor2.equals("vermelho"))) {
                resultado = "Roxo";
            } else if ((cor1.equals("vermelho") && cor2.equals("amarelo")) ||
                    (cor1.equals("amarelo") && cor2.equals("vermelho"))) {
                resultado = "Laranja";
            } else {
                resultado = "Verde";
            }

            System.out.println("A combinação resulta em: " + resultado);
        }

        sc.close();
    }
}
