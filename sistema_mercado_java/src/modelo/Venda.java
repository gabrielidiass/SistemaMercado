package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Venda implements Exibivel {

    // Atributos
    private double valor_total;
    private double cashback;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDate data;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Construtor
    public Venda(Cliente cliente, Funcionario funcionario) {
        this.cliente = cliente;
        this.funcionario = funcionario;

        data = LocalDate.now();

         double total = 0.0;

        // Percorre o carrinho do cliente
        for (ItemVenda item : cliente.getCarrinho()) {
            double preco = item.getProduto().getPreco();
            int quantidade = item.getQuantidade();
            total += preco * quantidade;
        }

       this.valor_total = total;
       this.cashback = total * 0.05;
       cliente.setCashback(this.cashback);
       funcionario.setComissao(this.cashback);
    }

    public String exibirDados() {
        String retorno = "Dados da venda:\n";
        retorno += "Data da venda: " + data.format(formato) + "\n";
        retorno += "Cliente: " + cliente.getNome() + "\n";
        retorno += "Funcionario: " + funcionario.getNome() + "\n";
        retorno += "Valor total: " + valor_total + "\n";
        return retorno;
    }

    // Getters e Setters
    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}