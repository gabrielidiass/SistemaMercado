
package modelo;

import java.time.LocalDate;

public class Pessoa implements Exibivel {
    
    // Atributos
    private String nome;
    private String cpf;

    // Construtores
    Pessoa() {
    }

    Pessoa(String n) {
        nome = n;
    }

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos
    public String exibirDados() {
        String aux = "Dados da Pessoa cadastrada:";
        aux += "\nNome: " + nome;
        if (cpf != null)
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
