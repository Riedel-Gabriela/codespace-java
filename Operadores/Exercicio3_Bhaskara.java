import java.util.Scanner;

class Bhaskara {
    public static void main(String[] args) {
        double determinante, a, b, c, x1, x2;

        java.util.Scanner scan = new Scanner(System.in);

        System.out.print("Digite o coeficiente 'a' da equação: ");
        a = scan.nextDouble();

        System.out.print("Digite o coeficiente 'b' da equação: ");
        b = scan.nextDouble();

        System.out.print("Digite o coeficiente 'c' da equação: ");
        c = scan.nextDouble();

        scan.close();

        determinante = Math.pow(b, 2) - (4*a*c);

        x1 = ((0 - b) + Math.sqrt(determinante))/(2*a);
        x2 = ((0 - b) - Math.sqrt(determinante))/(2*a);

        System.out.printf("x1 = %d\nx2 = %d\n", x1, x2);
    }
}
