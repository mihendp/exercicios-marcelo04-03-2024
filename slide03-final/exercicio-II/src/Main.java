import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Receba um valor e apresente o seu dobro, triplo e a metade
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        System.out.println("Seu dobro: " + (valor * 2));
        System.out.println("Seu triplo: " + (valor * 3));
        System.out.println("Sua metade: " + (valor/2));
    }
}