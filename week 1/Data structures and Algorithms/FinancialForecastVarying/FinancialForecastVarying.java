import java.util.Scanner;

public class FinancialForecastVarying {

    public static double calculateFutureValue(double presentValue, double[] growthRates, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, growthRates, periods - 1) * (1 + growthRates[periods - 1]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the present value: ");
        double presentValue = s.nextDouble();
        System.out.print("Enter the number of periods: ");
        int periods = s.nextInt();
        double[] growthRates = new double[periods];
        System.out.println("Enter the growth rate for each period (as a percentage, e.g., 5 for 5%):");
        for (int i = 0; i < periods; i++) {
            System.out.print("Period " + (i + 1) + ": ");
            growthRates[i] = s.nextDouble() / 100.0;
        }
        double futureValue = calculateFutureValue(presentValue, growthRates, periods);
        System.out.printf("Future value after %d periods is: %.2f%n", periods, futureValue);

    }
}
