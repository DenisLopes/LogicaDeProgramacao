package estruturaCondicional;

import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7f) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5f) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            float mediaFinal = (notaExame + media) / 2f;
            if (mediaFinal >= 5f) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }

}
