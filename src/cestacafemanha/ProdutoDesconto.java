package cestacafemanha;

public class ProdutoDesconto implements Produtos {

    private String nome;
    private double preco;
    private double desconto;

    public ProdutoDesconto() {
    }

    public ProdutoDesconto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco ;
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return this.preco - (this.preco * this.desconto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
