package 6-8;
package Practice7;

public class Main1 {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double result1 = mc1.power(2, 3);  // Возвести 2 в степень 3
        double result2 = mc1.complexModulus(3, 4);  // Вычислить модуль комплексного числа (3 + 4i)
        double circleLength = ((MathFunc) mc1).calculateCircleLength(5);  // Вычислить длину окружности с радиусом 5

        System.out.println("2^3 = " + result1);
        System.out.println("|3+4i| = " + result2);
        System.out.println("Длина окружности = " + circleLength);
        System.out.println("Значение PI = " + mc1.PI);

    }
}
