package ExercicioDeSala;

import java.util.Scanner;

public class Aposentadoria {
    static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
    static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe idade: ");
        Integer idade = scanner.nextInt();
        System.out.print("Informe o tempo de contribuição: ");
        Integer contribuicao = scanner.nextInt();
        Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        Boolean temTempoDeContribuicaoSuficiente = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
        Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
        if (podeAposentar){
            System.out.println("Sim! Pode aposentar. ");
        } else {
            System.out.println("Não vai ser possivel aposentar agora. ");
        }
        scanner.close();


    }
}
