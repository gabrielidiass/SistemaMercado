class ItemVenda:
    def __init__(self, produto, quantidade):
        self._produto = produto
        self._quantidade = quantidade

    def get_produto(self):
        return self._produto

    def set_produto(self, produto):
        self._produto = produto

    def get_quantidade(self):
        return self._quantidade

    def set_quantidade(self, quantidade):
        self._quantidade = quantidade