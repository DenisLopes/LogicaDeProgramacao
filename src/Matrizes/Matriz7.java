package Matrizes;

import java.util.Scanner;

/*O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de
soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a
posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".*/

public class Matriz7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[M][N];

        // leitura dos dados de entrada
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt();

        // como nossa matriz comeca na linha 0, vamos decrementar o valor da fila
        fila = fila - 1;

        // passo 1: vamos salvar o ultimo da fila escolhida
        int ultimoDaFila = mat[fila][N-1];

        // passo 2: vamos mover todos da fila (menos o ultimo) para a direita,
        // mas teremos que fazer isso da direita para a esquerda (contagem decrescente)
        for (int j=N-1; j>0; j--) {
            mat[fila][j] = mat[fila][j-1];
        }

        // passo 3: agora vamos armazenar o ultimo na primeira posicao da fila
        mat[fila][0] = ultimoDaFila;

        // pronto! Agora vamos imprimir a matriz alterada:
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}
