/*3. Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for*/

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            return;
        }

        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        if (size > 0) {
            double average = (double) sum / size;
            System.out.println("Сумма элементов: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        } else {
            System.out.println("Массив пуст.");
        }
    }
}
