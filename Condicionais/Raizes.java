import java.util.Scanner;

class Raizes {
    public static void main(String[] args) {
        int a, b, c, x1, x2, determinante;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os coeficientes a, b, c separados por espaço: ");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        scan.close();

        determinante = Math.pow(b, 2) - (4 * a * c);

        if (determinante > 0) {
            x1 = ((0 - b) + Math.sqrt(determinante)) / (2 * a);
            x2 = ((0 - b) - Math.sqrt(determinante)) / (2 * a);
            System.out.printf("Raízes: x1=%d, x2=%d\n", x1, x2);
        } else if (determinante == 0) {
            x1 = ((0 - b) + Math.sqrt(determinante)) / (2 * a);
            System.out.printf("Raiz dupla: x1=%d\n", x1);
        } else {
            System.out.println("Sem raízes reais.");
        }
    }
}
