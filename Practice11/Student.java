package Practice11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth; // Поле для хранения даты рождения

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Добавляем метод для возврата даты рождения в разных форматах
    public String getFormattedDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void main(String[] args) {
        // Пример использования
        Date dateOfBirth = new Date(); // Замените эту дату на фактическую дату рождения
        Student student = new Student("Иванов Иван", dateOfBirth);

        String shortFormat = "dd.MM.yy";
        String mediumFormat = "dd MMM yyyy";
        String fullFormat = "EEE, dd MMMM yyyy";

        System.out.println("Краткий формат: " + student.getFormattedDateOfBirth(shortFormat));
        System.out.println("Средний формат: " + student.getFormattedDateOfBirth(mediumFormat));
        System.out.println("Полный формат: " + student.getFormattedDateOfBirth(fullFormat));
    }
}
