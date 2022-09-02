package _2_comecando;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        Double alturaAoQuadrado = altura * altura;

        Double indiceMassaCorporal = peso / alturaAoQuadrado;

        System.out.println("Seu IMC é: " + indiceMassaCorporal);

        scanner.close();

    }
}