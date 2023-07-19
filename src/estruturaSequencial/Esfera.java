package estruturaSequencial;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {

        double volume, raio, pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        raio = scanner.nextDouble();

        volume = (4 / 3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }

}
