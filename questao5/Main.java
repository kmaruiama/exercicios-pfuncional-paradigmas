import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        InsereProduto.insere(produtos);
        List<Produto> produtosAtualizados = MudaPreco.produtosAtualizados(produtos);
        produtosAtualizados.forEach(produto -> {
            System.out.println("Produto com ID: " + produto.getId() + " agora possui preço: R$" + produto.getPreco());
        });
    }
}
