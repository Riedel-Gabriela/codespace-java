package Testes;
import java.util.Scanner;

class Teste1 {

    public static void segundaManeira(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declarando apenas UMA variável:
        double soma = 0;

        System.out.print("Digite os 6 valores inteiros, separados por espaço, a serem calculados a média: ");
        soma += scan.nextInt();
        soma += scan.nextInt();
        soma += scan.nextInt();
        soma += scan.nextInt();
        soma += scan.nextInt();
        soma += scan.nextInt();

        scan.close();

        System.out.printf("Média: %.1f\n", soma/6.0);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os 6 valores inteiros, separados por espaço, a serem calculados a média: ");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();

        scan.close();

        double media = (n1 + n2 + n3 + n4 + n5 + n6)/6.0;

        System.out.printf("Média: %.1f\n", media);
    }
    
}
