package Practice13;

import java.util.Scanner;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        } else if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ");
        }

        return fullName.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите Имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите Отчество (если есть): ");
        String middleName = scanner.nextLine();

        Person person = new Person(lastName, firstName, middleName);

        System.out.println("ФИО: " + person.getFullName());

        scanner.close();
    }
}
