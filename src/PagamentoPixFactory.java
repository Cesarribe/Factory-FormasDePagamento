class PagamentoPixFactory extends PagamentoFactory {
    @Override
    Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}