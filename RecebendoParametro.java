package _50_logica_8_4;

import java.util.Scanner;

public class RecebendoParametro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[]{"Jakarta EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        interarEExibirPosicaoDoVetorString(cursos);

        System.out.print("O curso que você deseja é: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
        interarPosicaoDoIf(posicaoValida, "Posição inválida!");
        imprimirTraco();
        String[] formasPagamentos = new String[]{"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamentos abaixo: ");
        interarEExibirPosicaoDoVetorString(formasPagamentos);

        System.out.println("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhido = scanner.nextInt();
        posicaoValida = posicaoFormaPagamentoEscolhido >= 0
                && posicaoFormaPagamentoEscolhido < formasPagamentos.length;
        interarPosicaoDoIf(posicaoValida, "Posição Inválida!");
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhido = formasPagamentos[posicaoFormaPagamentoEscolhido];
        imprimirTraco();
        System.out.println("O curso escolhido foi " + cursoEscolhido + "e a forma de pagamento é " + formaPagamentoEscolhido);
        scanner.close();
    }

    private static void interarPosicaoDoIf(Boolean posicaoValida, String x) {
        if (!posicaoValida) {
            System.err.println(x);
            System.exit(1);
        }
    }

    private static void interarEExibirPosicaoDoVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    private static void imprimirTraco() {
        System.out.println("---------------------------------");
    }
}

