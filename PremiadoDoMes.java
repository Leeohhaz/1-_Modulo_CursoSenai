package ExercicioDeSala;

import java.util.Scanner;

public class PremiadoDoMes {
    static final Double META_DE_FATURAMENTO_ANUAL = 100000.0;
    static final Integer PORCENTAGEM_MINIMA_DA_META = 80;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("olá, ADM.");
        System.out.print("Informe o valor da media salarial: ");
        Double mediaSalarial = scanner.nextDouble();
        System.out.print("informe o valor do faturamento real: ");
        Double faturamentoReal = scanner.nextDouble();

        boolean bateuAMeta = faturamentoReal >= META_DE_FATURAMENTO_ANUAL;
        boolean metaMinima = faturamentoReal >= PORCENTAGEM_MINIMA_DA_META;
        Double total = (META_DE_FATURAMENTO_ANUAL * PORCENTAGEM_MINIMA_DA_META / 100);
        Double total02 = (mediaSalarial * PORCENTAGEM_MINIMA_DA_META / 100);

        if (bateuAMeta) {
            System.out.println("Parabéns! Você ganhou " + total + " de Bonus.");
        } else if (metaMinima) {
            System.out.println("Parabéns! Você ganhou " + total02 + " de Bonus.");
        } else {
            System.out.println("Esse ano não tera Bonus! ");
        }

    }


}

