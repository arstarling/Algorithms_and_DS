package Practice8;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (>1): ");
        int n = scanner.nextInt();

        System.out.print("Простые множители " + n + ": ");
        factorize(n, 2);
    }

    public static void factorize(int n, int divisor) {
        if (n <= 1) {
            return;
        }

        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(n / divisor, divisor);
        } else {
            factorize(n, divisor + 1);
        }
    }
}
