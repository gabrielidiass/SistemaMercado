package heranca;

import modelo.Cliente;
import modelo.Funcionario;
import modelo.ItemVenda;
import modelo.Produto;

public class CadastrosIniciais {
    public static void Cadastro(String[] args) {
        // Classe usada para cadastrar os produtos inicialmente

        Produto agua = new Produto("Água Mineral", 2.99);
        Produto arroz = new Produto("Arroz Branco 5kg", 18.50);
        Produto feijao = new Produto("Feijão Carioca 1kg", 7.80);
        Produto leite = new Produto("Leite Integral 1L", 5.99);
        Produto pao = new Produto("Pão Francês", 0.75);
        Produto cafe = new Produto("Café Torrado e Moído 500g", 12.90);
        Produto acucar = new Produto("Açúcar Refinado 1kg", 3.50);
        Produto oleo = new Produto("Óleo de Soja 900ml", 8.20);
        Produto ovos = new Produto("Ovos Brancos Dúzia", 9.00);
        Produto sabao = new Produto("Sabão em Pó 1kg", 15.00);

        Cliente joao = new Cliente("João", "001.723.789.79");
        Cliente maria = new Cliente("Maria Souza", "123.456.789-01");
        Cliente pedro = new Cliente("Pedro Santos", "987.654.321-09");
       
        
        Funcionario funcionario1 = new Funcionario("Ana Paula", "111.222.333-44", "Caixa");
        Funcionario funcionario2 = new Funcionario("Bruno Costa", "555.666.777-88", "Repositor");
        Funcionario funcionario3 = new Funcionario("Carla Mendes", "999.000.111-22", "Gerente");


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

        

    }
}
