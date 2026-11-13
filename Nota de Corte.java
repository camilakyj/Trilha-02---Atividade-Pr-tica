package dobackofront;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        double notaCandidato = sc.nextDouble();
        double notaCorte = sc.nextDouble();
        double notaMinima = sc.nextDouble();

        System.out.println("Situação candidato:");

        if (notaCandidato < notaCorte) {
            System.out.println("Reprovado");
        } else if (notaCandidato >= notaMinima) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Lista de Espera");
        }

        sc.close();
    }
}
