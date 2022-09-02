package ExercicioDeSala;

import java.util.Scanner;

public class GastoNoMes2p {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite abaixo os valores gastos com... ");
        Double total = 0.0;
        System.out.print("Luz: ");
        total += scanner.nextDouble();
        System.out.print("Água: ");
        total += scanner.nextDouble();
        System.out.print("Telefone: ");
        total += scanner.nextDouble();
        System.out.print("Escola: ");
        total += scanner.nextDouble();
        System.out.print("Cartão: ");
        total += scanner.nextDouble();
        System.out.print("Supermecado: ");
        total += scanner.nextDouble();
        System.out.print("O gasto total foi de: " + total);
        scanner.close();
    }
}
