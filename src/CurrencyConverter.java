import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter");
        
        double amountUSD;
        while (true) {
            try {
                System.out.print("Enter amount in USD: ");
                amountUSD = scanner.nextDouble();
                if (amountUSD < 0) {
                    System.out.println("Amount cannot be negative. Please try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        double exchangeRate;
        while (true) {
            try {
                System.out.print("Enter the exchange rate (1 USD to your currency): ");
                exchangeRate = scanner.nextDouble();
                if (exchangeRate <= 0) {
                    System.out.println("Exchange rate cannot be zero or negative. Please try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        double amountConverted = convertCurrency(amountUSD, exchangeRate);
        
        System.out.printf("Amount in your currency: %.2f%n", amountConverted);
        
        scanner.close();
    }
    
    public static double convertCurrency(double amountUSD, double exchangeRate) {
        return amountUSD * exchangeRate;
    }
}
