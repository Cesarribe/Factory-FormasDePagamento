class PagamentoCartaoDebitoFactory extends PagamentoFactory {
    @Override
    Pagamento criarPagamento() {
        return new PagamentoCartaoDebito();
    }
}