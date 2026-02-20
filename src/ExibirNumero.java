import java.util.Scanner;

public class ExibirNumero {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double numero = 0;

        System.out.println("Digite um numero Positivo ou Negativo: ");

        numero = ler.nextDouble();
        if (numero > 0){
            System.out.println("Numero positivo.");
        } else {
            System.out.println("Numero Negativo.");
        }



    }
}
