package estruturaCondicional;

import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}

