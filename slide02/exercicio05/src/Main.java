import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 7 valores e mostre quantos são “primos”
        //e suas respectivas posições.

        Scanner scan = new Scanner(System.in);
        int[] valores = new int[7];
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> naoPrimos = new ArrayList<>();

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scan.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            for (int j = 2; j < valor; j++) {
                if (valor % j == 0) {
                    naoPrimos.add(valor);
                }
            }
            if (!naoPrimos.contains(valor) && valor != 0) {
                primos.add(valor);
                System.out.println("Posição " + (i + 1) + " valor: " + valor);
            }
        }

        System.out.println("\nQuantidade de primos: " + primos.size());

    }
}