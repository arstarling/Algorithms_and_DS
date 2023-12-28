package Practice4;

import java.util.Scanner;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(String action) {
        System.out.println(fullName + " " + action + ".");
    }

    public void talk(String action) {
        System.out.println(fullName + " " + action + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
        } while (!name.matches("[a-zA-Zа-яА-Я]+"));

        int age;
        do {
            System.out.print("Enter age (must be non-negative and consist only of digits): ");
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a number. Please enter the age in digits.");
                scanner.next(); // Clear the buffer
            }
            age = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer after nextInt()
        } while (age < 0);

        Person person = new Person(name, age);

        System.out.print("What is " + person.fullName + " doing? (walking/talking) ");
        String action = scanner.nextLine();

        if (action.equals("walking")) {
            person.move(action);
        } else if (action.equals("talking")) {
            person.talk(action);
        } else {
            System.out.println("Invalid action.");
        }
    }
}