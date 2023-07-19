package estruturaSequencial;

import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo, vendasEfetuadas, totalReceberNoFinalDomes, total;

        nomeVendedor = scanner.next();
        salarioFixo = scanner.nextDouble();
        vendasEfetuadas = scanner.nextDouble();

        totalReceberNoFinalDomes = vendasEfetuadas * 0.15;

        total = salarioFixo + totalReceberNoFinalDomes;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();

    }

}
