package vetores;

import java.util.Scanner;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
- todos os números pares
- a quantidade de números pares*/

public class NumerosPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] vet = new int[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextInt();
        }

        // 1: mostrando os numeros pares
        for (int i=0; i<N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println();

        // 2: mostrando a quantidade de pares
        int quantidadeDePares = 0;
        for (int i=0; i<N; i++) {
            if (vet[i] % 2 == 0) {
                quantidadeDePares++;
            }
        }
        System.out.println("quantidade de numeros pares são: " + quantidadeDePares);

        sc.close();
    }

}
