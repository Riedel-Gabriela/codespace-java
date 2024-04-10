import java.util.Scanner;

class CalculoNota {
    public static void main(String[] args) {
        int N, k, intAux;
        double P, T, W1, W2, mediaUnidade;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de testes realizados: ");
        N = scan.nextInt();

        System.out.print("Digite a quantidade de testes com aprovação: ");
        k = scan.nextInt();

        System.out.print("Digite a nota da prova individual ao final da unidade: ");
        P = scan.nextDouble();

        System.out.print("Digite a média dos N-2 testes com maior nota: ");
        T = scan.nextDouble();

        scan.close();

        intAux = N - 2 - k;
        W1 = 5 + Math.min(5, Math.max(0 , intAux ));
        W2 = 5 - Math.min(5, Math.max(0 , intAux ));

        mediaUnidade = Math.round((W1*P + (W2*T))/10);

        System.out.printf("Nota da unidade 1: %.1f\nPesos: W1 = %.1f, W2 = %.1f\n", mediaUnidade, W1, W2);
    }
}
