
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    public Cliente(String n, String cpf, String c) {
        super(n, cpf);
    }

    private List<Produto> carrinho = new ArrayList<>();
    
    // public String mostrarCarrinho() {
    //     String aux = "Carrinho de: " + getNome() + "\n";
    //     for (AvaliacaoFisica cadaAvaliacao : avaliacoes) {
    //         aux += "->> " + cadaAvaliacao;
    //     }
    //     return aux;
    // }

    // public void adicionarAvaliacao(AvaliacaoFisica avaliacao) {
    //     avaliacoes.add(avaliacao);
    // }

    // public List<AvaliacaoFisica> getAvaliacoes() {
    //     return avaliacoes;
    // }

    // public String getMatricula() {
    //     return matricula;
    // }

    // public void setMatricula(String matricula) {
    //     this.matricula = matricula;
    // }

    // public LocalDate getDataMatricula() {
    //     return dataMatricula;
    // }

    // public void setDataMatricula(LocalDate dataMatricula) {
    //     this.dataMatricula = dataMatricula;
    // }

    // public Plano getPlano() {
    //     return plano;
    // }

    // public void setPlano(Plano plano) {
    //     this.plano = plano;
    //     verificaDesconto();
    // }

    // public void verificaDesconto() {
    //     int tempo = (Period.between(dataMatricula, LocalDate.now()).getYears() * 12)
    //             + Period.between(dataMatricula, LocalDate.now()).getMonths();
    //     if (plano != null) {
    //         valorMensalidade = plano.getValor();
    //         if (tempo > 3) {
    //             valorMensalidade -= (valorMensalidade * 0.1);
    //         }
    //     }
    // }

    // @Override
    // public String exibirDados() {
    //     String aux = super.exibirDados();
    //     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //     aux += "\nMatricula: " + matricula;
    //     aux += "\nData de Matricula: " + dataMatricula.format(formato);
    //     aux += "\nAvaliacoes Fisicas Realizadas: " + getAvaliacoes().size();
    //     if (plano != null) {
    //         aux += "\nValor da Mensalidade: " + valorMensalidade;
    //         aux += "\nPlano: " + plano.getNome() + " - R$" + plano.getValor();
    //     }
    //     return aux;
    // }
}
