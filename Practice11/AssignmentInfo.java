package Practice11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AssignmentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Фамилия разработчика
        String developerName = "Cкворцова";

        // Ввод даты и времени получения задания
        System.out.print("Введите дату и время получения задания (в формате dd.MM.yyyy HH:mm:ss): ");
        String receivedDateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Попытка парсинга введенной даты
        Date assignmentReceivedDate = null;
        try {
            assignmentReceivedDate = dateFormat.parse(receivedDateString);
        } catch (Exception e) {
            System.err.println("Ошибка в формате введенной даты.");
            scanner.close();
            return;
        }

        // Дата и время сдачи задания (текущая дата и время)
        Date assignmentDueDate = new Date();
        String dueDateString = dateFormat.format(assignmentDueDate);

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + receivedDateString);
        System.out.println("Дата и время сдачи задания: " + dueDateString);

        scanner.close();
    }
}

