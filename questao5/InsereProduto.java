import java.util.List;
import java.util.Scanner;

public class InsereProduto {
    static void insere(List<Produto> produtos) {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            Produto produto = new Produto();
            System.out.println("Insira o ID do produto");
            input = scanner.nextDouble();
            if (input < 0) {
                break;
            }
            produto.setId((int) input);

            System.out.println("Insira o preço do produto");
            input = scanner.nextDouble();
            produto.setPreco(input);

            produtos.add(produto);
        }

    }
}
