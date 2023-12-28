package Practice14;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите математическое выражение:");
        String input = scanner.nextLine();

        String regex = "\\d+(?!\\+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean containsDigitsWithoutPlus = matcher.find();

        System.out.println("В выражении есть цифры без '+': " + containsDigitsWithoutPlus);
    }
}

