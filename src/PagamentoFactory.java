abstract class PagamentoFactory {
    abstract Pagamento criarPagamento();

    // Método para calcular a taxa correspondente ao tipo de pagamento
    void calcularTaxaPagamento(double valorProduto) {
        Pagamento pagamento = criarPagamento();
        pagamento.calcularTaxa(valorProduto);
    }
}