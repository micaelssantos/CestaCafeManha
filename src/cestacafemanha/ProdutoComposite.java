package cestacafemanha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Micael
 */
public class ProdutoComposite implements Produtos {

    private List<Produtos> childProdutos = new ArrayList<>();

    @Override
    public double getPreco() {
        double soma = 0;

        for (Produtos p : childProdutos) {
            soma += p.getPreco();
        }

        return soma;

    }

    public void adiciona(Produtos produtos) {
        childProdutos.add(produtos);
    }

    public void remove(Produtos produtos) {
        childProdutos.remove(produtos);
    }

}
