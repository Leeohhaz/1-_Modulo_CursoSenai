package _1_comecando;

import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite valor passado pelo cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println("Troco: " + resultado);

    }
}
