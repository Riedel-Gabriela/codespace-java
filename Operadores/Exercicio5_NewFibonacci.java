// Precisaria ter o Scanner importado para realizar a quantidade de numerais impressos variável conforme o usuário.
// import java.util.Scanner;

class NewFibonacci {
    // Fazemos uma função além do main, para podermos chamar ela passando um
    // parâmetro de repetição.
    public static void fibonacci(int n) {
        // Aqui abrimos 2 variáveis, e fazemos através de um for, iterando o índice,
        // a impressão dos números.
        int f0, f1;

        f0 = 0;
        f1 = 1;

        if (n >= 0)
        // Aqui eu garanto a impressão do zero:
            System.out.print(f0 + " ");
        if (n >= 1)
        // Aqui a impressão do 1:
            System.out.print(f1 + " ");
        // Aqui dentro do for, abrimos a terceira variável, chamamos ela de auxiliar, para ser iterada.
        // Começamos no índice dois, até que i seja menor ou igual que o numero de algarismos que eu quero ver em tela, e a cada
        // índice que eu completo o looping, eu aumento 1 em i para chegar até n.
        for (int i = 2; i <= n; i++) {
            System.out.print(f0 + f1 + " ");
            f1 = f0 + f1;
            f0 = f1 - f0;
        }
        // Adicionei esse prinln para que seja pulada uma linha entre o resultado da função e o workspace indicado no terminal.
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Aqui, chamamos a função fibonacci() passando o parâmetro 9, para que mostre
        // na tela os 10 algorismos da sequência
        // que foi pedido. Esse parâmetro é variável e poderia ser colocado com um
        // Scanner da seguinte forma:
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Digite quantos números gostaria de ver na sequência de
        // Fibonacci: ")
        // int param = scan.nextInt()-1;
        // fibonacci(param);
        fibonacci(9);
    }
}
