import java.util.Scanner;

class ArrayOperations {
    static void reverseArray(int[] array) {
    }
}

class ArraySumAverage {
    static double calculateAverage(int[] array) {
        return 0.0;
    }
}

class FactorialCalculatorWithInput {
    static int calculateFactorial(int n) {
        return 0;
    }
}

class HarmonicSeries {
    static double calculateHarmonicSeries(int n) {
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
                    System.out.println("Performing Reverse Array operation");
                    break;
                case 2:
                    System.out.println("Performing Calculate Average operation");
                    break;
                case 3:
                    System.out.println("Performing Calculate Factorial operation");
                    break;
                case 4:
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
