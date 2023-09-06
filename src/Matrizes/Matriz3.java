package Matrizes;

import java.util.Scanner;

/*Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver
empates.*/

public class Matriz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            int maior = mat[i][0];
            for (int j=1; j<N; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();
    }

}
