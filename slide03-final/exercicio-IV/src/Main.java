import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Informe o salário e apresente um aumento de 15%, mostrando o
        //valor final do salário, e o valor de acréscimo.

        Scanner scan = new Scanner(System.in);
        float salario;

        System.out.print("Digite o seu salário: R$");
        salario = scan.nextFloat();

        float acrescimo = salario * 0.15f, valorFinal = salario + acrescimo;
        System.out.println("Valor final do salário: R$" + valorFinal);
        System.out.println("Valor do acréscimo: R$" + acrescimo);

    }
}