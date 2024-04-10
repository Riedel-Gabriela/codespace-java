package Scanner;
import java.util.Scanner;

class VolumeCilindro {

    public static void main(String[] args) {
        
        // Scanner pede valor do raio da base do cilíndro.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio da base do cilíndro em centímetros: ");

        float raio = scan.nextFloat();

        System.out.print("Digite o a altura do cilíndro em centímetros: ");

        float altura = scan.nextFloat();

        float pi = 3.14F;
        
        // Fecha o scanner.
        scan.close();
        
        // Realiza o calculo e guarda numa variável.
        float volume = altura*pi*(raio*raio);
        
        //Mostra o resultado na tela.
        System.out.printf("Volume do cilíndro: %.1f cm³.\n", volume);
    }
}