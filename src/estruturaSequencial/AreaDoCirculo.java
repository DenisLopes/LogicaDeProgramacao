package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double area;
        double raio;
        double n = 3.14159;

        Scanner scanner = new Scanner(System.in);

        raio = scanner.nextDouble();

        area = (raio * raio) * n;

        System.out.printf("A=%.4f%n", area);
    }

}
