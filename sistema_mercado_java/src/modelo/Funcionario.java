package modelo;

public class Funcionario extends Pessoa {

    private String cargo;
    private double comissao;
 
    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double cashback) {
        this.comissao += cashback;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
  public String exibirDados() {
        String aux = "Dados do funcionário";
        aux += "\nNome: " + getNome();
        aux += "\nCPF: " + getCpf();
        aux += "\n Comissao acumulada: R$" + comissao;
        
        return aux;
    }
  

}