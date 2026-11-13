package dobackofront;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        int faltas = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (nota1 < 0 || nota1 > 10 ||
                nota2 < 0 || nota2 > 10 ||
                nota3 < 0 || nota3 > 10 ||
                faltas < 0) {
            System.out.println("Parâmetros inválidos");
        } else {
            System.out.printf(Locale.US, "Média: %.1f%n", media);

            if (faltas > 4) {
                System.out.println("Situação: Reprovado por Falta");
            } else if (media == 0) {
                System.out.println("Situação: Desistente");
            } else if (media >= 8) {
                System.out.println("Situação: Aprovado com sucesso");
            } else if (media >= 6) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Recuperação");
            }
        }

        sc.close();
    }
}
