import java.util.Scanner;

class Passagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a idade da criança: ");
        
        int number = scan.nextInt();

        scan.close();

        if (number >= 12) {
            System.out.println("100%");
        } else if (number >= 2){
            System.out.println("50%");
        } else {
            System.out.println("Isenta.");
        }
    }
    
}
