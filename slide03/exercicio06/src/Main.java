import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elabore um programa para converter dólar em reais.
        Scanner scan = new Scanner(System.in);
        double dolar, reais;

        System.out.println("Digite o valor em doláres: ");
        dolar = scan.nextFloat();

        reais = dolar*4.97;
        System.out.printf("Convertido para real: %.2f reais", reais);

    }
}