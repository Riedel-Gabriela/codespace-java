package Scanner;
import java.util.Scanner;

class Temperatura {

    public static void main(String[] args) {
        
        //Scanner pede o primeiro número referente a temperatura em celsius.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus celsius: ");

        float celsius = scan.nextFloat();
        
        //Fecha o scanner.
        scan.close();
        
        //Realiza a conversão e guarda numa variável.
        float converteFarenheit = 32 + celsius*1.8F;
        
        //Mostra o resultado na tela.
        System.out.printf("Temperatura em Farenheit: %.1f \n", converteFarenheit);
    }
}