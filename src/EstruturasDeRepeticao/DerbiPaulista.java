package EstruturasDeRepeticao;

import java.util.Scanner;

public class DerbiPaulista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vitoriasCorinthians = 0;
        int vitoriasPalmeiras = 0;
        int empates = 0;
        int novoDerbi = 1;

        while (novoDerbi == 1) {
            int golsCorinthians = sc.nextInt();
            int golsPalmeiras = sc.nextInt();

            if (golsCorinthians > golsPalmeiras) {
                vitoriasCorinthians = vitoriasCorinthians + 1;
            }
            else if (golsPalmeiras > golsCorinthians) {
                vitoriasPalmeiras = vitoriasPalmeiras + 1;
            }
            else {
                empates = empates + 1;
            }

            System.out.println("Novo Derbi (1-sim 2-nao)");
            novoDerbi = sc.nextInt();
        }

        int total = vitoriasPalmeiras + vitoriasCorinthians + empates;

        System.out.println(total + " Derbis");
        System.out.println("Corinthians:" + vitoriasCorinthians);
        System.out.println("Palmeiras:" + vitoriasPalmeiras);
        System.out.println("Empates:" + empates);

        if (vitoriasCorinthians > vitoriasPalmeiras) {
            System.out.println("Corinthians venceu mais");
        }
        else if (vitoriasPalmeiras > vitoriasCorinthians) {
            System.out.println("Palmeiras venceu mais");
        }
        else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }

}
