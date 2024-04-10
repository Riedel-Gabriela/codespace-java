package Scanner;
import java.util.Scanner;

class ComissaoVendedor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do Vendedor: ");

        String vendedor = scan.next();

        System.out.print("Digite o código da peça: ");

        String codigo_peca = scan.next();

        System.out.print("Digite o valor unitário da peça: ");

        float preco_peca = scan.nextFloat();

        System.out.print("Digite a quantidade de peças que foram vendidas: ");

        int qtd_pecas = scan.nextInt();

        scan.close();

        float venda = preco_peca*qtd_pecas;
        double comissao = venda*0.05;

        System.out.printf("Vendedor: " + vendedor + "\nValor da venda: R$%.2f\nComissão: R$%.2f\n", venda, comissao);
    }
    
}
