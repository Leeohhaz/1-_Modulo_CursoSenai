package _2_comecando;

import java.util.Scanner;

public class PrecoMedioBombom {
    public static void main(String[] args) {
        //PREÇOS DAS ÚLTIMAS 3 VENDAS REALIZADAS

        int preco1 = 5;
        int preco2 = 8;
        int preco3 = 12;

        int quantidadeVendas = 3;
        int somaDosPrecosDasVendas = preco1 + preco2 + preco3;
        int mediaPrecos = somaDosPrecosDasVendas / quantidadeVendas;

        System.out.println("\"Sistema de Calculo de Media\"");
        System.out.println("Preço 1: " + preco1);
        System.out.println("Preço 2: " + preco2);
        System.out.println("Preço 3: " + preco3);
        System.out.println("\nMedia dos Preços:\n" + mediaPrecos);

    }
}
