o texto abaixo se trata de entidades, atributos e métodos de um sistema simples para um mercado 


# Pessoa
private string nome 
private string cpf

# Cliente (herda de pessoa)
private Carrinho carrinho
private double cashback 
- exibirDados()
- somarCashback()
- calcularCashback()


# Funcionário (herda de pessoa)
private string cargo
private List<Venda> vendas;
- adicionaVenda()
- exibirDados()

# Venda
private double valor_total
private double cashback
private localDate data
private Carrinho carrinho
- adicionarVenda()
- calcularTotal()

# Produto
private String nome 
private double preço 

# Item Venda
private Produto produto
private int quantidade

# Carrinho
private List<ItemVenda> itens
private double valor
- calcularValor()
- exibirCarrinho()
- adicionarAoCarrinho

revise quais pilares da OO estao sendo abordados e quais nao estao