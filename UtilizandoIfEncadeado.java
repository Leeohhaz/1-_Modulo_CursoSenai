package _32_logica_5_4;

import java.util.Scanner;

public class UtilizandoIfEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        Double peso = scanner.nextDouble();
        Boolean pesoLeve = peso <= 60;
        Boolean pesoMedio = (peso > 60) && (peso <= 90);
        Boolean pesoPesado = peso > 90;

        if (pesoLeve) {
            System.out.println("O lutador é peso leve");
        } else {
            if (pesoMedio) {
                System.out.println("O lutador é peso médio");
            } else {
                if (pesoPesado) {
                    System.out.println("O lutador é peso pesado");

                }
            }
        }

        if (pesoLeve) {
            System.out.println("O lutador é peso leve");
        } else if (pesoMedio) {
            System.out.println("O lutador é peso médio");
        } else {
            System.out.println("O lutador é peso pesado");
        }
    }
}


