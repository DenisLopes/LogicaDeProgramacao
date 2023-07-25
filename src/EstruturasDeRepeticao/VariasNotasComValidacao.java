package EstruturasDeRepeticao;

import java.util.Scanner;

public class VariasNotasComValidacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int novoCalculo = 1;

        while (novoCalculo == 1) {
            double nota1 = sc.nextDouble();
            while (nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }

            double nota2 = sc.nextDouble();
            while (nota2 < 0.0 || nota2 > 10.0) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }

            double media = (nota1 + nota2) / 2.0;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = sc.nextInt();
            while (novoCalculo != 1 && novoCalculo != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();
            }
        }

        sc.close();
    }

}
