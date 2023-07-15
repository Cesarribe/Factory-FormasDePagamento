import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorPagamento gerenciador = new GerenciadorPagamento();
        boolean executar = true;

        while (executar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Fazer um pagamento");
            System.out.println("2 - Visualizar o saldo");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma opção de pagamento:");
                    System.out.println("1 - Cartão de crédito");
                    System.out.println("2 - Cartão de débito");
                    System.out.println("3 - Pix");

                    int tipoPagamento = scanner.nextInt();

                    System.out.println("Digite o valor do produto:");
                    double valorProduto = scanner.nextDouble();

                    gerenciador.realizarPagamento(tipoPagamento, valorProduto);
                    break;
                case 2:
                    gerenciador.visualizarSaldo();
                    break;
                case 3:
                    executar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}