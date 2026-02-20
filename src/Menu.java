import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("MENU DE CALCULOS: ");

        Scanner ler = new Scanner(System.in);
        double areaDoQuadrado;
        double areaDoCirculo;
        double lado1;
        double lado2;
        double raio;
        double P = 3.14;
        int escolha;

        System.out.println("""
                Escolha qual área você deseja calcular
                Quadrado: Digite 1
                Circulo: Digite 2
                Sair do Sistema: 3
                """);
        escolha = ler.nextInt();
        if (escolha == 1){
            System.out.println("Vamos calcular a Área do Quadrado");
        } else if (escolha == 2) {
            System.out.println("Vamos calcular a Área do Circulo");
        } else if (escolha == 3) {
            System.out.println("Sistema encerrado.");
        }

if (escolha ==1){
    System.out.println("Digite o valor de um dos Lados:");
    lado1 = ler.nextDouble();

    System.out.println("Digite o Valor do outro lado");
    lado2 = ler.nextDouble();

    areaDoQuadrado = lado1 * lado2;
    System.out.println("Área do quadrado = " + areaDoQuadrado);

} else if (escolha == 2){
    System.out.println("Digite o Valor do Raio do Circulo: ");
    raio = ler.nextDouble();
    areaDoCirculo = P * (raio * raio) ;

    System.out.println("Área do Circulo = " + areaDoCirculo);
}



    }
}
