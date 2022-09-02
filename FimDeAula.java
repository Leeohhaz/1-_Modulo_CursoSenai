package ExercicioDeSala;

import java.util.Scanner;

public class FimDeAula {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota do aluno: ");
        Double notaAluno = scanner.nextDouble();

        boolean alunoReprovado = notaAluno < 70;
        boolean alunoAprovado = notaAluno >= 70;

        if (alunoReprovado) {
            System.out.println("O aluno foi reprovado! ");
        } else if (alunoAprovado) {
            System.out.println("O aluno foi aprovado! ");
        }
        scanner.close();


    }
}
