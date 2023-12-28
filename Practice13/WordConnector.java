package Practice13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordConnector {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            System.out.print("Введите имя файла: ");
            String fileName = reader.readLine();
            reader.close();

            List<String> words = readWordsFromFile(fileName);
            if (words.size() > 0) {
                String result = getLine(words.toArray(new String[0]));
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Файл не содержит слов.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(words[0]);
        int wordsCount = words.length;

        while (true) {
            boolean found = false;
            for (int i = 1; i < wordsCount; i++) {
                String lastWord = result.substring(result.length() - 1);
                String currentWord = words[i];
                if (lastWord.equalsIgnoreCase(currentWord.substring(0, 1))) {
                    result.append(" ").append(currentWord);
                    words[i] = null;
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }

        return result.toString();
    }
}
