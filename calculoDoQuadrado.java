package _2_comecando;

import java.util.Scanner;

public class calculoDoQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero: ");
        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + quadrado + " . "  );

        scanner.close();


    }
}
