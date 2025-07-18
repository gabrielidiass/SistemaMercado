package modelo;

public class Produto implements Exibivel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String exibirDados() {
        String retorno = "Dados do produto:\n";
        retorno += "Produto" + nome + "\n";
        retorno += "Preco" + preco + "\n";
        return retorno;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }
}