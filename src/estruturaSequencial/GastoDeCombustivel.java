package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double tempoGasto, velocidadeMedia;
        double totalGasto;

        Scanner scanner = new Scanner(System.in);

        tempoGasto = scanner.nextDouble();
        velocidadeMedia = scanner.nextDouble();

        totalGasto = (tempoGasto * velocidadeMedia) / 12;

        System.out.printf("%.3f%n", totalGasto);

    }

}
