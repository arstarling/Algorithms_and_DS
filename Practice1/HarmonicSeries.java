package Practice1;

/*6. Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод).*/
public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в гармоническом ряде

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("Член %d: %.4f%n", i, sum);
        }
    }
}
