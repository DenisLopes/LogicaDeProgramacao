package estruturaSequencial;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, maior, resultado;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();


        maior = (A + B + Math.abs(A - B)) / 2;

        resultado = (maior + C + Math.abs(maior - C)) / 2;

        System.out.println(resultado + " eh o maior");


    }
}