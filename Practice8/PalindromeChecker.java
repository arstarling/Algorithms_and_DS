package Practice8;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().trim().toLowerCase();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        } else {
            // Вызываем isPalindrome для подстроки без первого и последнего символа.
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}

