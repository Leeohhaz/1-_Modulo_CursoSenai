package _6_logica_3_5;

import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "!" );
        scanner.close();
        Character variavelChar = 'A';


    }
}
