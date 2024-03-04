import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que receba 3 nomes e imprima na tela

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[3];

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o " + i + "º nome: ");
            nomes[i - 1] = scan.next();
        }

        System.out.println(Arrays.toString(nomes));
    }
}