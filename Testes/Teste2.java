import java.util.Scanner;

class Teste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int segundos, cron, minutos, minutos_totais, horas, horas_totais, dias;

        System.out.print("Digite os segundos contados: ");

        cron = scan.nextInt();

        scan.close();

        dias = cron/86400;

        cron = cron%86400;

        horas = cron/3600;

        cron = cron%3600;

        minutos = cron/60;

        cron = cron%60;

        segundos = cron;

        

        System.out.printf("%d dias %02d:%02d:%02d\n", dias, horas, minutos, segundos);
    }
    
}
