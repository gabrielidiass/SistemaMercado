from modelos.Pessoa import Pessoa

class Funcionario(Pessoa):
    def __init__(self, nome, cpf, cargo):
        super().__init__(nome, cpf)
        self._cargo = cargo
        self._comissao = 0.0

    def adicionar_comissao(self, valor):
        self._comissao += valor

    def exibir_dados(self):
        print(f"Funcionário: {self._nome}, Cargo: {self._cargo}, Comissão: R${self._comissao:.2f}")

    def get_cargo(self):
        return self._cargo

    def set_cargo(self, cargo):
        self._cargo = cargo

    def get_comissao(self):
        return self._comissao

    def set_comissao(self, comissao):
        self._comissao = comissao