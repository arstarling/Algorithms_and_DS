import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение типа String для преобразования в double: ");
        String stringValue = scanner.nextLine();

        try {
            double doubleValue;
            if (isNumeric(stringValue)) {
                doubleValue = Double.parseDouble(stringValue);
            } else {
                doubleValue = convertStringToNumber(stringValue);
            }
            System.out.println("Преобразованное значение: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования: " + e.getMessage());
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static int convertStringToNumber(String str) {
        char[] chars = str.toUpperCase().toCharArray();
        int result = 0;
        for (char c : chars) {
            int charValue = (int) c;
            if (charValue >= 65 && charValue <= 90) {
                result = result * 26 + (charValue - 64);
            }
        }
        return result;
    }
}
