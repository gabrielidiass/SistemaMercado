class Venda:
    def __init__(self, cliente, funcionario):
        self._cliente = cliente
        self._funcionario = funcionario
        self._valor_total = 0.0
        self._cashback = 0.0
       
    def calcular_valor_total(self):
        total = 0.0
        for item in self._cliente.get_carrinho():
            total += item.get_produto().get_preco()

        self._valor_total = total
        self._cashback = total * 0.05 
        self._cliente.adicionar_cashback(self._cashback)

        self._funcionario.adicionar_comissao(total * 0.02)

    def exibir_dados(self):
        print(f"Dados da venda")
        print(f"Cliente: {self._cliente.get_nome()}")
        print(f"Funcionario: {self._funcionario.get_nome()}")
        print(f"Valor total: R${self._valor_total:.2f}")
        print(f"Cashback gerado: R${self._cashback:.2f}")

    def get_cliente(self):
        return self._cliente

    def set_cliente(self, cliente):
        self._cliente = cliente

    def get_funcionario(self):
        return self._funcionario

    def set_funcionario(self, funcionario):
        self._funcionario = funcionario

    def get_valor_total(self):
        return self._valor_total

    def set_valor_total(self, valor_total):
        self._valor_total = valor_total

    def get_cashback(self):
        return self._cashback

    def set_cashback(self, cashback):
        self._cashback = cashback

    def get_data(self):
        return self._data

    def set_data(self, data):
        self._data = data