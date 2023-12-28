import java.util.Scanner;

/*4. Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на экран.*/
public class ArrayOperations {
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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;

        System.out.println("Введите элементы массива:");
        do {
            System.out.print("Элемент #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

            i++;
        } while (i < size);

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
