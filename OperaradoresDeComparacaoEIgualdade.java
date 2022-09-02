package _10_java_2_18;

public class OperaradoresDeComparacaoEIgualdade {
    public static void main(String[] args) {
        //comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
        //Igual: == (igual) e != (diferente)

        int a = 10;
        int b = 5;
        int c = 2;

        boolean maior = b > a;
        System.out.println("b > a: " + maior);

        boolean maiorOuIgual = b >= a;
        System.out.println("b >= a: " + maiorOuIgual);

        boolean menor = a < b;
        System.out.println("a < b: " + menor);

        boolean menorOuIgual = a <= 10;
        System.out.println("a <= 10" + menorOuIgual);

        boolean igual = a == b - c;
        System.out.println("a == b - c: " + igual);

        boolean diferente = a != c;
        System.out.println("a != c: " + diferente);
        System.out.println("---------------------------------------------------------------");

        boolean bloqueado = false;
        System.out.println(bloqueado);
        bloqueado = !bloqueado;
        System.out.println(bloqueado);




    }
}
