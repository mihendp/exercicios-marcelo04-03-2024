import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que receba 10 nomes de pessoas, informe
        //quantas delas se iniciam com a letra “A”, e mostre-as em tela,
        //bem como sua respectiva posição.

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scan.next();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].charAt(0) == 'a'){
                System.out.println((i + 1) + ". " + nomes[i]);
            }
        }

    }
}