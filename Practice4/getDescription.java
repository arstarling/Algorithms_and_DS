import java.util.Scanner;

// Создаем перечисление времен года
enum Seasons {
    Весна("весной", "Теплое время года", 15),
    Лето("летом", "Теплое время года", 25),
    Осень("осенью", "Холодное время года", 10),
    Зима("зимой", "Холодное время года", -5);

    private final String description;
    private final String temperatureDescription;
    private final int averageTemperature;

    Seasons(String description, String temperatureDescription, int averageTemperature) {
        this.description = description;
        this.temperatureDescription = temperatureDescription;
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return description;
    }

    public String getTemperatureDescription() {
        return temperatureDescription;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше любимое время года (Весна, Лето, Осень, Зима):");
        String userInput = scanner.nextLine();

        try {
            Seasons myFavoriteSeason = Seasons.valueOf(userInput);
            System.out.println("Мое любимое время года - " + myFavoriteSeason.getDescription());
            printSeasonDescription(myFavoriteSeason);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный ввод. Пожалуйста, введите одно из: Весна, Лето, Осень, Зима.");
        }
    }

    public static void printSeasonDescription(Seasons season) {
        switch (season) {
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}
