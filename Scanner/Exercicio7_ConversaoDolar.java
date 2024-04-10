package Scanner;
import java.util.Scanner;

class ConversaoDolar {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor em Dólares para conversão em Reais: ");

        float dolares = scan.nextFloat();

        System.out.print("Digite o valor da cotação atual do Dólar: ");

        float cotacao = scan.nextFloat();

        scan.close();

        float reais = dolares*cotacao;

        System.out.printf("USD$%.2f dólares equivale a R$%.2f reais.\n", dolares, reais);
    }
}
