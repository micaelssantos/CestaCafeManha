package cestacafemanha;
// Leaf - Folha
public class ProdutoLeaf implements Produtos {

    private String nome;
    private double preco;

    public ProdutoLeaf() {
    }

    public ProdutoLeaf(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
