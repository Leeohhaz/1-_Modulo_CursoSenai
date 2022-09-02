package ExercicioDeSala;

import java.util.Scanner;

public class EstruturaExercicio {
    static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
    static final Double NOTA_MINIMA = 60.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota de Português: ");
        Double notaPortugues = scanner.nextDouble();

        System.out.print("Mátematica: ");
        Double notaMatematica = scanner.nextDouble();

        Boolean notaMinimaParaProvaDePortugues = notaPortugues >= NOTA_MINIMA;
        Boolean notaMinimaParaProvaDeMatematica = notaMatematica >= NOTA_MINIMA;

        Double notaTotal = notaPortugues + notaMatematica;
        Boolean temNotaParaPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;
        Boolean passou = temNotaParaPassar
                && notaMinimaParaProvaDePortugues
                && notaMinimaParaProvaDeMatematica;
        if (passou) {
            System.out.println("Parabéns! Você passou. ");
        }else {
            System.out.println("Infelizmente, não foi dessa vez. ");
        }
    }
}
