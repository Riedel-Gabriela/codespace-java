import java.util.Scanner;

class Relogio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os segundos contados: ");

        int segundos_totais = scan.nextInt();

        scan.close();

        int segundos = segundos_totais%60;

        int minutos_totais = segundos_totais/60;

        int minutos = minutos_totais%60;

        int horas_totais = minutos_totais/60;

        int horas = horas_totais%60;

        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
    
}
