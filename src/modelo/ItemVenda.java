package modelo;

// import java.time.LocalDate;
// import java.time.Period;
// import java.time.format.DateTimeFormatter;
// import java.util.ArrayList;
// import java.util.List;

public class ItemVenda{

    private Produto produto;

    private String quantidade;
    
   


        
    public Produto getProduto() {
        return produto;
    }
     public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public ItemVenda(Produto produto, String quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}