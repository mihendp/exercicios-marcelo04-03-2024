import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elabora um programa que calcule a área de um retângulo.

        Scanner scan = new Scanner(System.in);
        float base, altura, area;

        System.out.println("Digite a base do triângulo: ");
        base = scan.nextFloat();

        System.out.println("Digite a altura do triângulo: ");
        altura = scan.nextFloat();

        area = (base * altura)/2;

        System.out.printf("A área desse triângulo é de: %.2f", area);
    }
}