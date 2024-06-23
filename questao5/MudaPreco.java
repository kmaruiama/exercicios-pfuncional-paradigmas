import java.util.List;
import java.util.stream.Collectors;

public class MudaPreco {
    static List<Produto> produtosAtualizados(List<Produto> produtos) {
        return produtos.stream()
                .peek(produto -> {
                    double novoValor = produto.getPreco() * 1.2;
                    produto.setPreco(novoValor);
                })
                .collect(Collectors.toList());
    }
}
