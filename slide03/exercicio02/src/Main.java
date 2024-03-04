import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que receba 3 nomes e 3 notas de cada um e depois os imprima na tela

        Scanner scan = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for(int i = 0; i < alunos.length; i++){
            Aluno aluno = new Aluno();

            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(scan.next());

            System.out.println("Digite a primeira nota do aluno: ");
            aluno.setNota1(scan.nextFloat());

            System.out.println("Digite a segunda nota do aluno: ");
            aluno.setNota2(scan.nextFloat());

            System.out.println("Digite a terceira nota do aluno: ");
            aluno.setNota3(scan.nextFloat());

            alunos[i] = aluno;
        }

        System.out.println(Arrays.toString(alunos));

    }
}