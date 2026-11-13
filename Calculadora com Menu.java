package dobackofront;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sc.nextLine();

        String operacao = sc.nextLine().trim().toLowerCase();

        double resultado = 0;
        String simbolo = "";
        boolean valida = true;

        switch (operacao) {
            case "1":
            case "soma":
                resultado = num1 + num2;
                simbolo = "+";
                break;

            case "2":
            case "subtração":
            case "subtracao":
                resultado = num1 - num2;
                simbolo = "-";
                break;

            case "3":
            case "multiplicação":
            case "multiplicacao":
                resultado = num1 * num2;
                simbolo = "*";
                break;

            case "4":
            case "divisão":
            case "divisao":
                if (num2 == 0) {
                    System.out.println("Divisão por zero não permitida");
                    valida = false;
                } else {
                    resultado = num1 / num2;
                    simbolo = "/";
                }
                break;

            case "5":
            case "resto":
                if (num2 == 0) {
                    System.out.println("Divisão por zero não permitida");
                    valida = false;
                } else {
                    resultado = num1 % num2;
                    simbolo = "mod";
                }
                break;

            case "6":
            case "potência":
            case "potencia":
                resultado = Math.pow(num1, num2);
                simbolo = "^";
                break;

            default:
                System.out.println("Operação não suportada");
                valida = false;
        }

        if (valida) {
            System.out.println(num1 + " " + simbolo + " " +
                    num2 + " = " + resultado);
        }

        sc.close();
    }
}
