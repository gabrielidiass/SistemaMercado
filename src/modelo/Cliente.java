
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private double cashback;
    private List<ItemVenda> carrinho = new ArrayList<>();

    public Cliente(String n, String cpf) {
        super(n, cpf);
    }

    public String mostrarCarrinho() {
        String retorno = "Carrinho: \n";
        for (ItemVenda cadaProduto : carrinho) {
            retorno += cadaProduto;
        }
        return retorno;
    }

    public void adicionarProduto(ItemVenda produto) {
        carrinho.add(produto);
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public List<ItemVenda> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<ItemVenda> carrinho) {
        this.carrinho = carrinho;
    }
}
