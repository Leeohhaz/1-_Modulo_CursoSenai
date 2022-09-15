package ExercicioDeSala;

import java.util.Scanner;

public class ExercicioPrimeiroMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        String[] cursos = new String[]{"Jakarta EE", "Spring", "Java OO Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "] " + cursos[i]);
        }
        System.out.print("O curso que você deseja é: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
        
        if (!posicaoValida) {
            encerrarProgramaPorCaudaDePosicaoInvalida();
        }
        imprimirTraco();
        String[] formasPagamentos = new String[]{"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamentos abaixo: ");
        for (int i = 0; i < formasPagamentos.length; i++) {
            System.out.println("[" + i + "] " + formasPagamentos[i]);
        }
        System.out.println("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhido = scanner.nextInt();
        posicaoValida = posicaoFormaPagamentoEscolhido >= 0
                && posicaoFormaPagamentoEscolhido < formasPagamentos.length;
        if (!posicaoValida) {
            encerrarProgramaPorCaudaDePosicaoInvalida();
        }
        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhido = formasPagamentos[posicaoFormaPagamentoEscolhido];
        imprimirTraco();
        System.out.println("O curso escolhido foi " + cursoEscolhido + "e a forma de pagamento é " + formaPagamentoEscolhido);
        scanner.close();
    }

    private static void encerrarProgramaPorCaudaDePosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
    private static void imprimirTraco() {
        System.out.println("---------------------------------");
    }
}


