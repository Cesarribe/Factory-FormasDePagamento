import java.util.ArrayList;
import java.util.List;

class GerenciadorPagamento {
    private List<Pagamento> listaPagamentos = new ArrayList<>();
    private double saldo = 0.0;

    public void realizarPagamento(int tipoPagamento, double valorProduto) {
        PagamentoFactory factory;

        switch (tipoPagamento) {
            case 1:
                factory = new PagamentoCartaoCreditoFactory();
                break;
            case 2:
                factory = new PagamentoCartaoDebitoFactory();
                break;
            case 3:
                factory = new PagamentoPixFactory();
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                return;
        }

        Pagamento pagamento = factory.criarPagamento();
        listaPagamentos.add(pagamento);
        pagamento.calcularTaxa(valorProduto);
        saldo += valorProduto;
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}