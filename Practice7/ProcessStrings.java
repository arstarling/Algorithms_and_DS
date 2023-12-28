package 6-8;
package Practice7;

import java.util.Scanner;

public class ProcessStrings implements StringProcessor {
    @Override
    public String process(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringProcessor stringProcessor = new ProcessStrings();

        System.out.print("Введите входную строку: ");
        String inputString = scanner.nextLine();
        String processedString = stringProcessor.process(inputString);

        System.out.println("Входная строка: " + inputString);
        System.out.println("Обработанная строка: " + processedString);

        scanner.close(); // Закрываем Scanner после использования
    }
}

