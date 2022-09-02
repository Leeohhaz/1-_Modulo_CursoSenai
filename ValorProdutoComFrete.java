package ExercicioDeSala;

import java.util.Scanner;

public class ValorProdutoComFrete {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Boolean cobrarFrete = valorProduto < 100;
        Double valorFinal = valorProduto;

        if (cobrarFrete){
            valorFinal += 15.0; // += atribuir valor
        }
        System.out.println("Valor final: " + valorFinal);
        scanner.close();




    }
}


