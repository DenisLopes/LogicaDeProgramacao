package estruturaSequencial;

import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) {
        int a, b, x;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        x = a + b;

        System.out.println("X = " + x);

    }

}
