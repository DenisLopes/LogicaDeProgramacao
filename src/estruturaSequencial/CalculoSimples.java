package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int codigoDaPeca1, numeroDaPeca1, codigoDaPeca2, numeroDaPeca2;
        double valorUnitario1, valorUnitario2, valorPagar;

        Scanner scanner = new Scanner(System.in);

        codigoDaPeca1 = scanner.nextInt();
        numeroDaPeca1 = scanner.nextInt();
        valorUnitario1 = scanner.nextDouble();

        codigoDaPeca2 = scanner.nextInt();
        numeroDaPeca2 = scanner.nextInt();
        valorUnitario2 = scanner.nextDouble();

        valorPagar = (numeroDaPeca1 * valorUnitario1) + (numeroDaPeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);


    }

}
