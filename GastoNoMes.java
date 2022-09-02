package ExercicioDeSala;

import java.util.Scanner;

public class GastoNoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Conta de Luz: ");
        Double contaDeLuz = scanner.nextDouble();

        System.out.print("Conta de Água: ");
        Double contaDeAgua = scanner.nextDouble();

        System.out.print("Conta de Telefone: ");
        Double contaDeTelefone = scanner.nextDouble();

        System.out.print("Mensalidade da escola: ");
        Double mensalidadeEscola = scanner.nextDouble();

        System.out.print("Fatura cartão: ");
        Double faturaCartao = scanner.nextDouble();

        System.out.print("Compra do Mês: ");
        Double supermecado = scanner.nextDouble();

        Double valorFinal = contaDeLuz += contaDeAgua += contaDeTelefone += mensalidadeEscola += faturaCartao += supermecado;

        System.out.println("Valor final: " + valorFinal);
        scanner.close();

    }


}
