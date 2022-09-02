package ExercicioDeSala;

import java.util.Scanner;

public class ContadorDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("numero: ");
        int numeroFinal = entrada.nextInt();
        // for ( inicialização, condição, incremento)
        for (int i = 1; i <= numeroFinal; i++) {
            System.out.println(i);
        }
    }
}
