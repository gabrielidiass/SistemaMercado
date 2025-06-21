- 


# Pessoa
private string nome 
private string cpf

# Cliente (herda de pessoa)
private ItemVenda carrinho
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
private ItemVenda carrinho
- adicionarVenda()
- calcularTotal()

# Produto
private String nome 
private double preço 

# Item Venda
private Produto produto
private int quantidade

revise quais pilares da OO estao sendo abordados e quais nao estao