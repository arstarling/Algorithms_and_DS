import java.util.Arrays;
import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        // Генерация массива с использованием метода random() класса Math
        double[] array1 = generateArrayUsingMathRandom(10);
        System.out.println("Массив, сгенерированный с использованием метода random() класса Math:");
        printArray(array1);

        // Генерация массива с использованием класса Random
        double[] array2 = generateArrayUsingRandomClass(10);
        System.out.println("Массив, сгенерированный с использованием класса Random:");
        printArray(array2);

        // Сортировка массива
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Вывод отсортированных массивов
        System.out.println("Отсортированный массив (метод random() класса Math):");
        printArray(array1);

        System.out.println("Отсортированный массив (класс Random):");
        printArray(array2);
    }

    public static double[] generateArrayUsingMathRandom(int size) {
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }

        return array;
    }

    public static double[] generateArrayUsingRandomClass(int size) {
        double[] array = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }

        return array;
    }

    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


