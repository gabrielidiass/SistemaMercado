class Produto:
    def __init__(self, nome, preco):
        self._nome = nome
        self._preco = preco

    def get_preco(self):
        return self._preco

    def get_nome(self):
        return self._nome

    def set_nome(self, nome):
        self._nome = nome

    def get_preco(self):
        return self._preco

    def set_preco(self, preco):
        self._preco = preco