package _1_comecando;

import java.util.Scanner;

public class IntroducaoVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do produto: ");

        Double valorProduto = scanner.nextDouble();

        System.out.println("valor do produto: " + valorProduto);

        Double valorProdutoComFrete = valorProduto + 2;

        System.out.println("valorProdutoComFrete: " + valorProdutoComFrete);

        scanner.close();

    }
}
