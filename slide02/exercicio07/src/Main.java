import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elabore um programa que receba o nome de 4 times de Futebol,
        //e realize as combinações dos jogos de ida e volta para todos,
        //mostrando em uma tabela, todos os jogos possíveis.

        Scanner scan = new Scanner(System.in);
        String[] times = new String[4];

        for (int i = 0; i < times.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º time: ");
            times[i] = scan.next();
        }

        List<List<String>> jogos = chaveJogos(times);
        tabelaJogos(jogos);

    }

    public static List<List<String>> chaveJogos(String[] times){
        List<List<String>> jogos = new ArrayList<>();
        int qtdTimes = times.length;
        int qtdRodadas = qtdTimes - 1;

        List<String> timesAux = new ArrayList<>(List.of(times));

        for (int rodada = 0; rodada < qtdRodadas; rodada++){
            List<String> jogosDaRodada = new ArrayList<>();
            for (int i = 0; i < qtdTimes/2; i++){
                String time1 = timesAux.get(i);
                String time2 = timesAux.get(timesAux.size() - i - 1);
                jogosDaRodada.add(time1 + "   x   " + time2);
            }
            timesAux.add(1, timesAux.remove(qtdTimes - 1));
            jogos.add(jogosDaRodada);
        }

        return jogos;
    }

    public static void tabelaJogos(List<List<String>> jogos){
        System.out.println("| Time A\tx\tTime B |");

        for (int rodada = 0; rodada < jogos.size(); rodada++){
            List<String> jogosDaRodada = jogos.get(rodada);

            for (String jogo : jogosDaRodada){
                System.out.println("| " + jogo + " |");
            }
            System.out.println();
        }
    }
}