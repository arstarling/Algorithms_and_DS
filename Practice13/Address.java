package Practice13;

import java.util.Scanner;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Страну: ");
        country = scanner.nextLine();

        System.out.print("Введите Регион: ");
        region = scanner.nextLine();

        System.out.print("Введите Город: ");
        city = scanner.nextLine();

        System.out.print("Введите Улицу: ");
        street = scanner.nextLine();

        System.out.print("Введите Дом: ");
        house = scanner.nextLine();

        System.out.print("Введите Корпус: ");
        building = scanner.nextLine();

        System.out.print("Введите Квартиру: ");
        apartment = scanner.nextLine();

        scanner.close();
    }

    public String toString() {
        return "Country: " + country +
                "\nRegion: " + region +
                "\nCity: " + city +
                "\nStreet: " + street +
                "\nHouse: " + house +
                "\nBuilding: " + building +
                "\nApartment: " + apartment;
    }

    public static void main(String[] args) {
        Address address = new Address();

        System.out.println("Адрес:");
        System.out.println(address.toString());
    }
}

