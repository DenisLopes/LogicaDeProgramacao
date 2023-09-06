package vetores;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
do vetor (supor não haver empates). Mostrar também a posição do maior elemento.*/

public class MaiorNumero {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int posicaoMaior = 0;

        for (int i=1; i<N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("O maior numero é: %.1f%n", maior);
        System.out.println("Na posição do vetor: " + posicaoMaior);

        sc.close();
    }

}
