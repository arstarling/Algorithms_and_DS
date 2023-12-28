package Practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем текущую дату и время
        Date currentDate = new Date();

        // Ввод даты от пользователя
        System.out.print("Введите дату в формате dd.MM.yyyy HH:mm:ss: ");
        String userDateString = scanner.nextLine();

        // Формат для парсинга введенной даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        try {
            // Парсим введенную дату
            Date userDate = dateFormat.parse(userDateString);

            // Сравниваем даты
            if (currentDate.before(userDate)) {
                System.out.println("Введенная дата находится в будущем относительно текущей даты.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Введенная дата находится в прошлом относительно текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.out.println("Некорректный формат введенной даты.");
        }

        scanner.close();
    }
}

