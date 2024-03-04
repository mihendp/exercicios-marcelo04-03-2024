import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Receba dois valores e apresente todas as operações básicas:
        //adição, subtração, divisão, multiplicação e resto

        Scanner scan = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Soma: " + (valor1 + valor2));
        System.out.println("Subtração: " + (valor1 - valor2));
        System.out.println("Divisão: " + (valor1 / valor2));
        System.out.println("Multiplicação: " + (valor1 * valor2));
        System.out.println("Resto: " + (valor1 % valor2));
    }
}