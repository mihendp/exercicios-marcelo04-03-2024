import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que some o conteúdo de dois vetores e armazene o resultado em um terceiro vetor.

        int[] v1 = {10, 20, 30, 40, 50};
        int[] v2 = {5, 4, 3, 2, 1};
        int[] v3 = new int[v1.length];

        for (int i = 0; i < v1.length; i++){
            v3[i] = v1[i] + v2[i];
        }

        System.out.println(Arrays.toString(v3));
    }
}