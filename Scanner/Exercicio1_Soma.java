package Scanner;
import java.util.Scanner;

class Soma {

    public static void main(String[] args) {
        
        //Scanner pede o primeiro número pra soma e espera o usuário digitar.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        int num1 = scan.nextInt();
        
        //Após o "enter", o programa pede o segundo número ao usuário.
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        //Fecha o scanner.
        scan.close();
        
        //Realiza a soma e guarda numa variável.
        int soma = num1+num2;
        
        //Mostra o resultado na tela.
        System.out.println("Soma: "+soma);
    }
}