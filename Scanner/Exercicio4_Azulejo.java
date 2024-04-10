package Scanner;
import java.util.Scanner;

class Azulejo {

    public static void main(String[] args) {
        int comprimento, altura, azulejo;
        double area_azulejo, area_parede, qtd_azulejos;
        
        // Scanner pede valor do comprimento da parede.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o comprimento da parede em metros: ");
        comprimento = scan.nextInt();
        
        // Após o "enter", o programa pede a altura da parede ao usuário.
        System.out.print("Digite a altura da parede: ");
        altura = scan.nextInt();

        // Agora o lado do azulejo considerando que ele é quadrado.
        System.out.print("Digite o lado do azulejo em centimentros: ");
        azulejo = scan.nextInt();

        // Fecha o scanner.
        scan.close();

        area_azulejo = azulejo*azulejo;

        area_parede = (comprimento*altura)*10000;

        qtd_azulejos = area_parede/area_azulejo;
             
        //Mostra o resultado na tela.
        System.out.printf("Serão necessários %.0f azulejos pra cobrir a área da parede.\n", Math.ceil(qtd_azulejos));
    }
}