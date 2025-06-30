import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Conversion rates: base is INR (Indian Rupees)
        double usdRate = 0.012;    // 1 INR = 0.012 USD
        double eurRate = 0.011;    // 1 INR = 0.011 EUR
        double gbpRate = 0.0095;   // 1 INR = 0.0095 GBP

        System.out.println("====== Currency Converter (Base: INR) ======");
        System.out.println("Available conversions:");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.print("Choose an option (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inrAmount = sc.nextDouble();

        double convertedAmount;

        switch (choice) {
            case 1:
                convertedAmount = inrAmount * usdRate;
                System.out.printf("%.2f INR = %.2f USD\n", inrAmount, convertedAmount);
                break;
            case 2:
                convertedAmount = inrAmount * eurRate;
                System.out.printf("%.2f INR = %.2f EUR\n", inrAmount, convertedAmount);
                break;
            case 3:
                convertedAmount = inrAmount * gbpRate;
                System.out.printf("%.2f INR = %.2f GBP\n", inrAmount, convertedAmount);
                break;
            default:
                System.out.println("Invalid option selected.");
        }

        sc.close();
    }
}
