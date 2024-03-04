import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Solicite ao usuário a digitação de um nome qualquer. Armazena cada letra em uma
        posição de um vetor. Em seguida imprima o nome informado de trás para frente, apresentando
        o relatório com as seguintes informações: quantas letras existem, quantas
        são vogais, quantas são consoantes.*/

        Scanner scan = new Scanner(System.in);
        String nome;
        int vogais = 0, consoantes = 0;

        System.out.println("Digite um nome qualquer: ");
        nome = scan.next();

        char[] charsNome = new char[nome.length()];

        for (int i = 0; i < nome.length(); i++){
            charsNome[i] = nome.charAt(i);
            if (nome.charAt(i) == 'a' || nome.charAt(i) == 'e' ||
                nome.charAt(i) == 'i' || nome.charAt(i) == 'o' || nome.charAt(i) == 'u') {
                vogais++;
            } else {
                consoantes++;
            }
        }

        for (int i = charsNome.length - 1; i >= 0; i--){
            System.out.print(charsNome[i]);
        }

        System.out.println("\nQuantidade de letras: " + nome.length());
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}