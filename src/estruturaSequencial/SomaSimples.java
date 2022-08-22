package estruturaSequencial;

import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {

        int a, b, soma;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

    }

}
