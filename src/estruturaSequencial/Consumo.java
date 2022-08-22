package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int distanciaPercorrida;
        double combustivelGasto, totalGasto;

        Scanner scanner = new Scanner(System.in);

        distanciaPercorrida = scanner.nextInt();
        combustivelGasto = scanner.nextDouble();

        totalGasto = distanciaPercorrida / combustivelGasto;

        System.out.printf("%.3f km/l%n", totalGasto);

    }

}
