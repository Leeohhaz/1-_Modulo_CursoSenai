package _7_logica_3_6;

import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("E o seu sobrenome? ");
        String sobrenome = scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + "!" );
        scanner.close();


    }
}
