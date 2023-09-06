package Matrizes;

import java.util.Scanner;

/*) Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
na tela somente os números negativos da matriz.*/

public class Matriz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

        sc.close();
    }

}
