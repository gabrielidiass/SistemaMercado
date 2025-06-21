package modelo;

public class Venda implements Exibivel {
    private double valor_total;
    private double cashback;
    private Cliente cliente;
    private Funcionario funcionario;

    public String realizarVenda() {
        String retorno = "Carrinho: \n";
        for (ItemVenda cadaProduto : carrinho) {
            retorno += cadaProduto;
        }
        return retorno;
    }

    @Override
    public String exibirDados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDados'");
    }

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