import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que receba e armazene 5 nomes, e em seguida
        //os imprima na tela, com suas devidas posições.

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i+1) + "º nome: ");
            nomes[i] = scan.next();
        }

        for (int i = 1; i <= nomes.length; i++){
            System.out.println(i + ". " + nomes[i-1]);
        }
    }
}