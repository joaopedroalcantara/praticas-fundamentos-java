import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Escreva um numero Inteiro:");
        numero = ler.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("O numero é ar!");
        } else {
            System.out.println("O numero é impar!");
        }
    }
}
