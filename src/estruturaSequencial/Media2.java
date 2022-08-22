package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double nota1, nota2, nota3, media, pesoFinal;
        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        Scanner scanner = new Scanner(System.in);

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        pesoFinal = pesoA + pesoB + pesoC;

        media = ((nota1 * pesoA) + (nota2 * pesoB) + (nota3 * pesoC)) / pesoFinal;

        System.out.printf("MEDIA = %.1f%n", media);


    }

}
