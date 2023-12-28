package Practice13;

public class StringOperations {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        // 2. Распечатать последний символ строки.
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверить, заканчивается ли строка подстрокой "!!!".
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли строка на \"!!!\": " + endsWithExclamation);

        // 4. Проверить, начинается ли строка подстрокой "I like".
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли строка с \"I like\": " + startsWithILike);

        // 5. Проверить, содержит ли строка подстроку "Java".
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка \"Java\": " + containsJava);

        // 6. Найти позицию подстроки "Java" в строке "I like Java!!!".
        int javaIndex = inputString.indexOf("Java");
        System.out.println("Позиция подстроки \"Java\": " + javaIndex);

        // 7. Заменить все символы "а" на "о".
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены символов: " + replacedString);

        // 8. Преобразовать строку к верхнему регистру.
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + upperCaseString);

        // 9. Преобразовать строку к нижнему регистру.
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowerCaseString);

        // 10. Вырезать подстроку "Java".
        String substring = inputString.substring(7, 11);
        System.out.println("Вырезанная подстрока: " + substring);
    }
}
