package ExercicioDeSala;

import java.util.Scanner;

public class ExercicioNumeroInicial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero Inicial: ");
        int numeroInicial = entrada.nextInt();

        System.out.println("Numero Final: ");
        int numeroFinal = entrada.nextInt();

        int numeroAtual = numeroInicial;
        while (numeroAtual <= numeroFinal) {
            System.out.println(numeroAtual);
            numeroAtual++;
        }
    }
}
