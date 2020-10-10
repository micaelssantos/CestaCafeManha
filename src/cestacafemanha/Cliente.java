package cestacafemanha;

/**
 *
 * @author Micael
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produtos cafe = new ProdutoLeaf("Café", 8);
        Produtos capuccino = new ProdutoLeaf("Capuccino", 12);
        ProdutoComposite cesta = new ProdutoComposite();
        cesta.adiciona(capuccino);
        cesta.adiciona(cafe);
        
        Produtos geleia1 = new ProdutoLeaf("Geleia 1", 12);
        Produtos geleia2 = new ProdutoLeaf("Geleia 2", 13.5);
        
        ProdutoComposite caixaGeleia = new ProdutoComposite();
        caixaGeleia.adiciona(geleia1);
        caixaGeleia.adiciona(geleia2);
        cesta.adiciona(caixaGeleia);
        
        ProdutoDesconto suco = new ProdutoDesconto("Suco", 10, 0.05);
        
        ProdutoComposite produtosDescontos = new ProdutoComposite();
        produtosDescontos.adiciona(suco);
        
        cesta.adiciona(produtosDescontos);
        
        System.out.println("O preço total da cesta é: " + cesta.getPreco() + " reais.");

    }

}
