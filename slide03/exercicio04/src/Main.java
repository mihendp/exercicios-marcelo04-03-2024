import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que receba a temperatura em Celsius e converta-a para Fahrenheit.
        Scanner scan = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Digite a temperatura em celsius: ");
        celsius = scan.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.2f", fahrenheit);
    }
}