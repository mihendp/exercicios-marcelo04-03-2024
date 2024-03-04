import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que calcule o IMC (índice de massa corpórea)
        float peso, altura, imc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        peso = scan.nextFloat();

        System.out.println("Informe sua altura: ");
        altura = scan.nextFloat();

        imc = peso/(altura * altura);
        System.out.printf("Seu IMC é de: %.2f", imc);
    }
}