package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int numeroFuncionario, horasTrabalhadas;
        double valorHoras, salario;

        Scanner scanner = new Scanner(System.in);

        numeroFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorHoras = scanner.nextDouble();

        salario = horasTrabalhadas * valorHoras;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }

}