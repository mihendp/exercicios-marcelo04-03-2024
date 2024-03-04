import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = 0;

        String nome;
        Double preco;
        int qtd;

        List<Produto> produtos = new ArrayList<Produto>();

        System.out.println("Quantos produtos deseja cadastrar?");
        range = scan.nextInt();

        for (int i = 0; i < range; i++) {
            System.out.println("Digite o nome do produto que deseja: ");
            nome = scan.next();

            System.out.println("Digite o preço de " + nome + ": ");
            preco = scan.nextDouble();

            System.out.println("Digite a quantidade disponível do produto: ");
            qtd = scan.nextInt();

            Produto pd = new Produto(nome, preco, qtd);
            produtos.add(pd);

        }

        Double maiorValor = produtos.stream()
                .mapToDouble(valor -> valor.getPreco())
                .max()
                .getAsDouble();

        List<Produto> produtoDeMaiorValor = produtos.stream()
                .filter(produto -> produto.getPreco().equals(maiorValor))
                .toList();


        Double menorValor = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .min()
                .getAsDouble();

        List<Produto> produtoDeMenorValor = produtos.stream()
                .filter(produto -> produto.getPreco().equals(menorValor))
                .toList();

        int maiorQtd = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .max()
                .getAsInt();

        List<String> nomeProdutoDeMaiorQtd = produtos.stream()
                        .filter(produto -> produto.getQuantidade().equals(maiorQtd))
                        .map(pd -> pd.getNome())
                        .toList();

        double maiorValorTotal = 0;
        Produto produtoMaiorValorTotal = null;

        for (Produto produto : produtos){
            if (produto.getValorTotal() > maiorValorTotal){
                maiorValorTotal = produto.getValorTotal();
                produtoMaiorValorTotal = new Produto(produto.getNome(), produto.getPreco(), produto.getQuantidade());
            }
        }

        System.out.println(produtos.toString());
        System.out.println("Produto(s) de menor valor: " + produtoDeMenorValor);
        System.out.println("Produto(s) de maior valor: " + produtoDeMaiorValor);
        System.out.println("Nome do(s) produto(s) de maior quantidade: " + nomeProdutoDeMaiorQtd);
        System.out.println("Produto de maior valor total: " + produtoMaiorValorTotal);
        System.out.println("|     NOME     |     PREÇO     |     QUANTIDADE     |");
//        produtos.forEach(produto -> System.out.println(produto.getNome() + "          "
//                        + produto.getPreco() + "          "
//                        + produto.getQuantidade()));

        soutTabela(produtos);

    }

    private static void soutTabela(List<Produto> produtos) {
        for (Produto produto : produtos) {
            int length = produto.getNome().length();
            int espacos = 14 - length;

            System.out.print("|");
            if (length % 2 != 0) {
                System.out.print(" ");
            }
            for (int i = 0; i < (espacos / 2); i++) {
                System.out.print(" ");
            }
            System.out.print(produto.getNome());
            for (int i = 0; i < (espacos / 2); i++) {
                System.out.print(" ");
            }
            System.out.print("|");

            String precoFormatado = new DecimalFormat("0.00").format(produto.getPreco());
            int lengthPreco = precoFormatado.length();
            int espacosPreco = 15 - lengthPreco;

            if (lengthPreco % 2 == 0) {
                System.out.print(" ");
            }
            for (int i = 0; i < (espacosPreco / 2); i++) {
                System.out.print(" ");
            }
            System.out.printf(precoFormatado);
            for (int i = 0; i < (espacosPreco / 2); i++) {
                System.out.print(" ");
            }
            System.out.print("|");

            int lengthQtd = produto.getQuantidade().toString().length();
            int espacosQtd = 20 - lengthQtd;

            if (lengthQtd % 2 != 0) {
                System.out.print(" ");
            }
            for (int i = 0; i < (espacosQtd / 2); i++) {
                System.out.print(" ");
            }
            System.out.print(produto.getQuantidade());
            for (int i = 0; i < (espacosQtd / 2); i++) {
                System.out.print(" ");
            }
            System.out.printf("|%n");
        }
    }
}