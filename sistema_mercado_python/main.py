from datetime import date
from modelos.Impressora import Impressora
from modelos.Pessoa import Pessoa
from modelos.Funcionario import Funcionario
from modelos.Cliente import Cliente
from modelos.ItemVenda import ItemVenda
from modelos.Venda import Venda
from modelos.Produto import Produto


if __name__ == "__main__":
    # Produtos 
    agua = Produto("Água Mineral", 2.99)
    arroz = Produto("Arroz Branco 5kg", 18.50)
    acucar = Produto("Açúcar Refinado 1kg", 3.50)
    ovos = Produto("Ovos Brancos Dúzia", 9.00)
    sabao = Produto("Sabão em Pó 1kg", 15.00)

    # Clientes
    joao = Cliente("João", "001.723.789-79")

    # Funcionários
    ana_paula = Funcionario("Ana Paula", "111.222.333-44", "Caixa")
    ana_paula.exibir_dados()

    # Itens de venda
    item1 = ItemVenda(agua, 12)
    item2 = ItemVenda(arroz, 1)
    item3 = ItemVenda(ovos, 6)
    item4 = ItemVenda(sabao, 2)
    item5 = ItemVenda(acucar, 3)

    # Adiciona produtos ao carrinho de Joao
    joao.adicionar_item(item1)
    joao.adicionar_item(item2)
    joao.adicionar_item(item3)
    joao.adicionar_item(item4)
    joao.adicionar_item(item5)

    # Realiza a venda
    venda1 = Venda(joao, ana_paula)
    venda1.calcular_valor_total()

Impressora.imprimir_dados(ana_paula)
Impressora.imprimir_dados(venda1)
Impressora.imprimir_dados(joao)
