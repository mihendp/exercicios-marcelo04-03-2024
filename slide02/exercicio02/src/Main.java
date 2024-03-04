import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Faça um algoritmo que copie o dobro do conteúdo de um vetor em
        //um segundo vetor. Os valores iniciais você pode inserir manualmente.

        int[] v1 = {1,2,3,4,5};
        int[] v2 = new int[v1.length];

        int i = 0;
        for (int n : v1){
            v2[i] = n * 2;
            i++;
        }

        System.out.println(Arrays.toString(v2));
    }
}