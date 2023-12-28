import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private String baseCurrency;
    private Map<String, Double> exchangeRates;

    public CurrencyConverter(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        this.exchangeRates = new HashMap<>();
    }

    public void setExchangeRate(String currencyCode, double rate) {
        exchangeRates.put(currencyCode, rate);
    }

    public double convert(double amount, String targetCurrency) {
        if (baseCurrency.equals(targetCurrency)) {
            return amount;
        }

        if (!exchangeRates.containsKey(targetCurrency)) {
            throw new IllegalArgumentException("Курс обмена для целевой валюты не установлен.");
        }

        double rate = exchangeRates.get(targetCurrency);
        return amount * rate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter("USD");

        // Устанавливаем курсы обмена (примеры)
        converter.setExchangeRate("EUR", 0.85);
        converter.setExchangeRate("GBP", 0.72);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Текущие курсы обмена:");
            for (Map.Entry<String, Double> entry : converter.exchangeRates.entrySet()) {
                System.out.println("1 " + converter.baseCurrency + " = " + entry.getValue() + " " + entry.getKey());
            }

            System.out.println("Введите сумму: ");
            double amount = scanner.nextDouble();

            System.out.println("Введите валюту суммы (например, USD, EUR, GBP): ");
            String sourceCurrency = scanner.next();

            System.out.println("Введите целевую валюту (например, USD, EUR, GBP): ");
            String targetCurrency = scanner.next();

            double convertedAmount = converter.convert(amount, targetCurrency);

            System.out.println(amount + " " + sourceCurrency + " = " + convertedAmount + " " + targetCurrency);

            System.out.println("Хотите продолжить? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}
