import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um conversor de medidas, receba um valor em metros, e
        //mostre os valores em quilômetros, centímetros, decímetros,
        //decâmetro e hectômetro.

        Scanner scan = new Scanner(System.in);
        float metros;
        System.out.println("Digite uma medida em metros: ");
        metros = scan.nextFloat();

        System.out.println("Quilômetros: " + (metros / 1000));
        System.out.println("Centímetros: " + (metros * 100));
        System.out.println("Decímetros: " + (metros * 10));
        System.out.println("Decâmetro: " + (metros / 10));
        System.out.println("Hectômetro: " + (metros / 100));
    }
}