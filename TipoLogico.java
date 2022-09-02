package _9_logica_3_7;

public class TipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira: " + variavelVerdadeira);
        Boolean varialFalsa = false;
        System.out.println("Variável falsa: " + varialFalsa);
        System.out.println("---------------------------------------------------------------------");
        Integer idade = 20;
        Boolean podeTirarCarteira = idade>= 18;
        //System.out.println("Pode tirar carteira? " + podeTirarCarteira);
        if (podeTirarCarteira){
            System.out.println("Sim! Ele(a) pode tirar carteira. ");
        } else {
            System.out.println("Não! El(a) não pode tirar carteira. ");

        }

    }
}
