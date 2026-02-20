import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um Numero:");
        numero = ler.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Resultado da Fatorial:" + fatorial);
    }
}
