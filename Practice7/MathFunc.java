package 6-8;
package Practice7;

public class MathFunc implements MathCalculable {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Другие методы и функции, которые могут использовать PI

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }
}

