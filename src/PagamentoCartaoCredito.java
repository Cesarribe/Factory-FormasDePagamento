class PagamentoCartaoCredito implements Pagamento {
    @Override
    public void calcularTaxa(double valorProduto) {
        double taxa = valorProduto * 0.09; // Exemplo de cálculo de taxa para pagamento com cartão de crédito (5%)
        double total = valorProduto + taxa;
        System.out.println("Pagamento com cartão de crédito:");
        System.out.println("Valor do produto: R$" + valorProduto);
        System.out.println("Taxa: R$" + taxa);
        System.out.println("Total a pagar: R$" + total);
    }
}