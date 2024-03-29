package vetores;

import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.*/

public class Vetor3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i=0; i<N; i++) {
            B[i] = sc.nextInt();
        }

        // 1: gerando o vetor C
        int[] C = new int[N];
        for (int i=0; i<N; i++) {
            C[i] = A[i] + B[i];
        }

        // 2: mostrando o vetor C na tela
        for (int i=0; i<N; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

        sc.close();
    }

}
