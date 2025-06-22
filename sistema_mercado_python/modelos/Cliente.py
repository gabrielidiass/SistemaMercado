from modelos.Pessoa import Pessoa

class Cliente(Pessoa):
    def __init__(self, nome, cpf):
        super().__init__(nome, cpf)
        self._carrinho = []
        self._cashback = 0.0

    def adicionar_item(self, item):
        self._carrinho.append(item)

    def adicionar_cashback(self, valor):
        self._cashback += valor

    def exibir_dados(self):
        print(f"Cliente: {self._nome}, CPF: {self._cpf}, Cashback: R${self._cashback:.2f}")

    def get_carrinho(self):
        return self._carrinho

    def set_carrinho(self, carrinho):
        self._carrinho = carrinho

    def get_cashback(self):
        return self._cashback

    def set_cashback(self, cashback):
        self._cashback = cashback