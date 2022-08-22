package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class MedidasDoTerreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura do terreno");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno");
        double comprimento = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado do terreno");
        double metroQuadardo = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadardo;

        System.out.printf("Area do terreno custa %.2f reais %n", area);
        System.out.printf("O preço total do terreno é %.2f reais %n", preco);

    }

}
