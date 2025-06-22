
package modelo;

public class Pessoa implements Exibivel {
    
    // Atributos
    private String nome;
    private String cpf;

    // private significa que esses atributos só podem ser acessados
    //  diretamente de dentro da própria classe Pessoa. Isso é um
    //  princípio de encapsulamento, que ajuda a proteger os dados.

    // Construtores
    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos
    public String exibirDados() {
        String aux = "Dados da Pessoa cadastrada:";
        aux += "\nNome: " + nome;
            aux += "\nCPF: " + cpf;

        return aux;
    }

    @Override
    public String toString() {
        return nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
