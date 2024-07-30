import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            fibonacci(num);
        }
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println(1 + " " + 0);
        } else {
            int zero = 0;
            int first = 1;
            for (int i = 1; i < n; i++) {
                int temp = zero;
                zero = first;
                first += temp;
            }
            System.out.println(zero + " " + first);
        }
    }
}