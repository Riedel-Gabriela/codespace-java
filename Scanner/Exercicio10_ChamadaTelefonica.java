package Scanner;
import java.util.Scanner;

class ChamadaTelefonica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a duração da chamada em segundos: ");

        int chamada_segundos = scan.nextInt();

        scan.close();
        
        
        if (chamada_segundos <= 60) {
            System.out.printf("O valor da chamada ficou R$1,79\n");
        } else {
            float chamada_minutos = (float)chamada_segundos/60;
            double chamada_arredondada = Math.ceil(chamada_minutos);
            double chamada_taxa = chamada_arredondada*1.79d;
            System.out.printf("O valor da chamada ficou R$%.2f\n", chamada_taxa);
        }
    }
    
}
