
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Impressora;
import modelo.ItemVenda;
import modelo.Produto;
import modelo.Venda;

public class Heranca {
    public static void main(String[] args) {
        // Classe usada para cadastrar os produtos inicialmente

        Produto agua = new Produto("Água Mineral", 2.99);
        Produto arroz = new Produto("Arroz Branco 5kg", 18.50);
        Produto acucar = new Produto("Açúcar Refinado 1kg", 3.50);
        Produto ovos = new Produto("Ovos Brancos Dúzia", 9.00);
        Produto sabao = new Produto("Sabão em Pó 1kg", 15.00);

        Cliente joao = new Cliente("João", "001.723.789.79");

        Funcionario ana_paula = new Funcionario("Funcionaria", "111.222.333-44", "Caixa");
        ana_paula.setNome("Ana Paula");
        Impressora.imprimirDados(ana_paula);

        ItemVenda item1 = new ItemVenda(agua, 12);
        ItemVenda item2 = new ItemVenda(arroz, 1);
        ItemVenda item3 = new ItemVenda(ovos, 6);
        ItemVenda item4 = new ItemVenda(sabao, 2);
        ItemVenda item5 = new ItemVenda(acucar, 3);

        // Adiciona produtos em suas quantidades no carrinho de Joao
        joao.adicionarProduto(item1);
        joao.adicionarProduto(item2);
        joao.adicionarProduto(item3);
        joao.adicionarProduto(item4);
        joao.adicionarProduto(item5);

        // Realizar venda
        Venda venda1 = new Venda(joao, ana_paula);

        Impressora.imprimirDados(venda1);
        Impressora.imprimirDados(joao);

        // pos comissao
         Impressora.imprimirDados(ana_paula);
    }
}
