import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai n nya untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        scanner.close();

        if (n < 0) {
            System.out.println("n nya HARUS lebih besar atau sama dengan 0");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
