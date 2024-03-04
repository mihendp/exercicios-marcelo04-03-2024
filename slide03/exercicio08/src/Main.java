import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Elabore um programa que irá devolver o ano de nascimento.
        String dia, mes;
        int idade;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia de seu nascimento: ");
        dia = scan.next();

        System.out.println("Agora digite o mês em que nasceu: ");
        mes = scan.next();

        System.out.println("Por fim, digite sua idade: ");
        idade = scan.nextInt();

//       System.out.println("O seu ano de nascimento é: " + (2024-idade));


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date aniversario = sdf.parse(dia + "/" + mes + "/2024");
        Date hoje = new Date();

        long diff = hoje.getTime() - aniversario.getTime();

        int anoDeNascimento = diff < 0 ? (2024 - idade) - 1 : 2024 - idade;
        System.out.println("Seu ano de nascimento é: " + anoDeNascimento);

    }
}