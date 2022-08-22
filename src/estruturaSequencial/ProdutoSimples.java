package estruturaSequencial;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {
        int produto1, produto2, prod;

        Scanner scanner = new Scanner(System.in);

        produto1 = scanner.nextInt();
        produto2 = scanner.nextInt();

        prod = produto1 * produto2;

        System.out.println("PROD = " + prod);
    }

}
