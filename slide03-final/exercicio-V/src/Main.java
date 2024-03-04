import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Calculadora de média “ponderada” (peso 2, peso 3, peso 5)
        Scanner scan = new Scanner(System.in);
        float peso2, peso3, peso5, mediaPonderada;

        System.out.println("Digite o valor de peso 2: ");
        peso2 = scan.nextFloat();

        System.out.println("Digite o valor de peso 3: ");
        peso3 = scan.nextFloat();

        System.out.println("Digite o valor de peso 5: ");
        peso5 = scan.nextFloat();

        mediaPonderada = (peso2 * 2+peso3 * 3+peso5 * 5)/(2+3+5);
        System.out.println("Média ponderada: " + mediaPonderada);
    }
}