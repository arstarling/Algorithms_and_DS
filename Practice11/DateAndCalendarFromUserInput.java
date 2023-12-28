package Practice11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение года, месяца и числа
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // Уменьшаем на 1, так как месяцы в Calendar начинаются с 0
        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        // Чтение часов и минут
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        // Формирование объекта Date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        // Формирование объекта Calendar
        Calendar customCalendar = Calendar.getInstance();
        customCalendar.set(year, month, day, hours, minutes);

        // Вывод даты и времени
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Создан объект Date: " + dateFormat.format(date));
        System.out.println("Создан объект Calendar: " + dateFormat.format(customCalendar.getTime()));

        scanner.close();
    }
}

