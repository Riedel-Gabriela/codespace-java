package Scanner;
import java.util.Scanner;

class ConsumoVeiculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tempo total da viagem em horas inteiras: ");

        int horas = scan.nextInt();

        System.out.print("Digite a velocidade média em Km/h: ");

        int velocidade = scan.nextInt();

        scan.close();

        int distancia = velocidade*horas;

        int autonomia = 12;

        float litros = distancia/autonomia;

        System.out.printf("Dados da Viagem:\nVelocidade Média: %d Km/h\nTempo Gasto: %d horas\nDistância Percorrida: %d Km\nConsumo: %.1f Litros de gasolina\n", velocidade, horas, distancia, litros);

    }    
}
