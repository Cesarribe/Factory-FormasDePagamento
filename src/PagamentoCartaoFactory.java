class PagamentoCartaoCreditoFactory extends PagamentoFactory {
    @Override
    Pagamento criarPagamento() {
        return new PagamentoCartaoCredito();
    }
}