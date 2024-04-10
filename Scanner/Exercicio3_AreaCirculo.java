package Scanner;
import java.util.Scanner;

class Area {

    public static void main(String[] args) {
        
        // Scanner pede valor do raio da circunferencia.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência em centímetros: ");

        float raio = scan.nextFloat();

        float pi = 3.14F;
        
        // Fecha o scanner.
        scan.close();
        
        // Realiza o calculo e guarda numa variável.
        float area = pi*(raio*raio);
        
        //Mostra o resultado na tela.
        System.out.printf("Área do círculo: %.1f cm².\n", area);
    }
}