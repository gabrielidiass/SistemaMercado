
# Pessoa
private string nome 
private string cpf

# Cliente (herda de pessoa)
private List<ItemVenda> carrinho
private double cashback 
- exibirDados()

# Funcionário (herda de pessoa)
private string cargo
private double comissao
- exibirDados()

# Venda
private double valor_total;
    private double cashback;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDate data (now.);

# Produto
private String nome 
private double preço 

# Item Venda
private Produto produto
private int quantidade
