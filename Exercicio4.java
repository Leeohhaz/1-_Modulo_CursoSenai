package ExercicioDeSala;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if (ano % 400 == 0) { // todos os múltiplos de 400 são bissextos
            System.out.println("O ano \"" + ano + "\" é um ano bissexto");
        } else if (ano % 4 == 0) {
            if (ano % 100 != 0) { // Múltiplo de 4, e nao é múltiplo de 100 é bissexto
                System.out.println("O ano \"" + ano + "\" é um ano bissexto");
            } else {
                System.out.println("O ano \"" + ano + "\" náo é um ano bissexto");
            }
        }  else {
            System.out.println("O ano \"" + ano + "\" não é um ano bissexto");
        }
    }
}
