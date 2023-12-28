package Practice2;

public class Tester {
    public static void main(String[] args) {
        int maxCircles = 5; // Максимальное количество окружностей

        Circle[] circles = new Circle[maxCircles];
        int count = 0; // Количество окружностей в массиве

        // Создание и добавление окружностей в массив
        Point center1 = new Point(0, 0);
        Circle circle1 = new Circle(center1, 5.0);
        circles[count] = circle1;
        count++;

        Point center2 = new Point(2, 3);
        Circle circle2 = new Circle(center2, 2.5);
        circles[count] = circle2;
        count++;

        // Добавьте еще окружности по аналогии

        // Вывод информации о окружностях
        for (int i = 0; i < count; i++) {
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println();
        }
    }
}
