class PagamentoPix implements Pagamento {
    @Override
    public void calcularTaxa(double valorProduto) {
        double taxa = 0; // No exemplo, não há taxa para pagamento com Pix
        double total = valorProduto + taxa;
        System.out.println("Pagamento com Pix:");
        System.out.println("Valor do produto: R$" + valorProduto);
        System.out.println("Taxa: R$" + taxa);
        System.out.println("Total a pagar: R$" + total);
    }
}