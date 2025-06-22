package modelo;

// import java.time.LocalDate;
// import java.time.Period;
// import java.time.format.DateTimeFormatter;
// import java.util.ArrayList;
// import java.util.List;

public class ItemVenda {

    private Produto produto;
    private int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}