import java.util.Scanner;

class MRU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a posição inicial em metros: ");

        int xz = scan.nextInt();

        System.out.print("Digite a velocidade em metros/segundos: ");

        float v = scan.nextFloat();

        System.out.print("Digite o instante que você deseja saber a posição, em segundos: ");

        int t = scan.nextInt();

        scan.close();

        float xt = xz + (v*t);      

        System.out.printf("Foram percorridos %.1f metros do trajeto.\n", xt);
    }
}