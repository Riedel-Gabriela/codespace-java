package Scanner;
import java.util.Scanner;

class Media {

    public static void main(String[] args) {
        
        // Scanner pede as cinco notas pra realizar o claculo da média.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = scan.nextInt();

        System.out.print("Digite o quinto número: ");
        int num5 = scan.nextInt();
        
        // Fecha o scanner.
        scan.close();
        
        // Realiza o cálculo da média e guarda numa variável.
        float media = (num1+num2+num3+num4+num5)/5;
        
        // Mostra o resultado na tela.
        System.out.printf("A média dos números inteiros é %.1f.\n", media);
    }
}