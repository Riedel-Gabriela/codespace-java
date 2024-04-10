import java.util.Scanner;

class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        
        int number = scan.nextInt();

        scan.close();

        if (number > 0) {
            System.out.printf("o número %d é positivo.\n", number);
        } else if (number < 0) {
            System.out.printf("o número %d é negativo.\n", number);
            
        } else {
            System.out.printf("o número %d é igual a zero.\n", number);
        }
    }
}