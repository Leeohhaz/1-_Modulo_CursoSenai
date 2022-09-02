package ExercicioDeSala;

import java.util.Scanner;

public class FimDeAula02 {
    static final Integer NOTA_MINIMA_PARA_PASSAR_DE_ANO = 70;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota do aluno: ");
        Double notaAluno = scanner.nextDouble();

        boolean alunoAprovado = notaAluno > NOTA_MINIMA_PARA_PASSAR_DE_ANO;

        if (alunoAprovado){
            System.out.println("Você foi aprovado.");
        }else {
            System.out.println("Você foi reprovado.");
        }

    }
}
