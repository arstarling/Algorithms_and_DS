package Practice1;

/*7. Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода.*/

import java.util.Scanner;

public class FactorialCalculatorWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для вычисления факториала: ");
        int number = scanner.nextInt();
        if (number > -2147483648 & number < 2147483647){
            long factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен " + factorial);

        }
        scanner.close();

    }

    public static long calculateFactorial(int n) { //метод класса
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
