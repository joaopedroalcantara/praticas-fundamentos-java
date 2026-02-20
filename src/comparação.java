import java.util.Scanner;

public class comparação {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int numeroDigitado = 0;
    int numeroDigitado2 = 0;

        System.out.println("Escrava dois Numero Inteiros. ");


        System.out.println("Digite o Primeiro numero: ");
        numeroDigitado = ler.nextInt();

        System.out.println("Digite o Segundo numero: ");
        numeroDigitado2 = ler.nextInt();

        if (numeroDigitado == numeroDigitado2){
            System.out.println("Os numeros são iguais.");
        } else if (numeroDigitado > numeroDigitado2){
            System.out.println("Primeiro numero é maior.");
        } else {
            System.out.println("Segundo numero é maior.");
        }








    }
}
