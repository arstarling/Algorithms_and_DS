import java.util.Scanner;

class ArrayOperations {
    static void reverseArray(int[] array) {
        // Реализация метода reverseArray
    }
}

class ArraySumAverage {
    static double calculateAverage(int[] array) {
        // Реализация метода calculateAverage
        return 0.0;
    }
}

class FactorialCalculatorWithInput {
    static int calculateFactorial(int n) {
        // Реализация метода calculateFactorial
        return 0;
    }
}

class HarmonicSeries {
    static double calculateHarmonicSeries(int n) {
        // Реализация метода calculateHarmonicSeries
        return 0.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Reverse Array");
            System.out.println("2. Calculate Average");
            System.out.println("3. Calculate Factorial");
            System.out.println("4. Calculate Harmonic Series");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Вместо вызова функции, напишите здесь код для вызова метода reverseArray
                    System.out.println("Performing Reverse Array operation");
                    break;
                case 2:
                    // Вместо вызова функции, напишите здесь код для вызова метода calculateAverage
                    System.out.println("Performing Calculate Average operation");
                    break;
                case 3:
                    // Вместо вызова функции, напишите здесь код для вызова метода calculateFactorial
                    System.out.println("Performing Calculate Factorial operation");
                    break;
                case 4:
                    // Вместо вызова функции, напишите здесь код для вызова метода calculateHarmonicSeries
                    System.out.println("Performing Calculate Harmonic Series operation");
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
