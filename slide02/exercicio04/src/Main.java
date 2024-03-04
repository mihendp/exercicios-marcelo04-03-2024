import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 10 valores e mostre quantos são “pares”
        //e suas devidas posições...

        Scanner scan = new Scanner(System.in);
        int[] valores = new int[10];
        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i+1) + "º valor: ");
            valores[i] = scan.nextInt();
        }

        for (int valor : valores){
            if (valor % 2 == 0){
                pares.add(valor);
            }
        }

        System.out.println("Valores inseridos: " + Arrays.toString(valores));
        System.out.println("Valores pares: " + pares);
        System.out.println("Quantidade de valores pares inseridos: " + pares.size());

    }
}