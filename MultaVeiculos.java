package ExercicioDeSala;

import java.util.Scanner;

public class MultaVeiculos {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Velocidade permitida: 60Km");
        System.out.println("Informe seu veiculo: ");
        String nomeVeiculo = scanner.nextLine();
        System.out.print("Sua velocidade é: ");
        int velocidade = scanner.nextInt();


    }
}
