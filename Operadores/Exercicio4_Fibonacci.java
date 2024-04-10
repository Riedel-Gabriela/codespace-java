class Fibonacci {
    public static void main(String[] args) {
        int f0, f1, next_number, i;
        i = 0;

        f0 = 0;
        f1 = 1;

        while (i < 10) {
            next_number = f0 + f1;
            f0 = f1;
            f1 = next_number;
            i++;
            System.out.printf("%d ", next_number);
        }

        System.out.println(" ");
    }
}
