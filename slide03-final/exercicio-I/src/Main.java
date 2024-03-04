import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Verificador de ano bissexto

        Scanner scan = new Scanner(System.in);
        int ano;

        System.out.println("Digite um ano e te direi se é bissexto: ");
        ano = scan.nextInt();

        if (ano % 4 == 0 && (ano % 10 != 0 || ano % 400 == 0)){
            System.out.println("O ano " + ano + " é bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é bissexto!");
        }

    }
}