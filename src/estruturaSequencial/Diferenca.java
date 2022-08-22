package estruturaSequencial;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {

        int valor1, valor2, valor3, valor4, diferenca;

        Scanner scanner = new Scanner(System.in);

        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        valor3 = scanner.nextInt();
        valor4 = scanner.nextInt();

        diferenca = ((valor1 * valor2) - (valor3 * valor4));

        System.out.println("DIFERENCA = " + diferenca);

    }

}
