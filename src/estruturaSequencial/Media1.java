package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double pesoA = 3.5;
        double pesoB = 7.5;
        double nota1, nota2, pesoFinal, media;

        Scanner scanner = new Scanner(System.in);

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();

        pesoFinal = pesoA + pesoB;

        media = ((pesoA * nota1) + (pesoB * nota2)) / pesoFinal;
        
        System.out.printf("MEDIA = %.5f%n", media);
    }

}
