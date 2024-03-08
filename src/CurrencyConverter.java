import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter");
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();
        
        System.out.print("Enter the exchange rate (1 USD to your currency): ");
        double exchangeRate = scanner.nextDouble();
        
        double amountConverted = convertCurrency(amountUSD, exchangeRate);
        
        System.out.println("Amount in your currency: " + amountConverted);
        
        scanner.close();
    }
    
    public static double convertCurrency(double amountUSD, double exchangeRate) {
        return amountUSD * exchangeRate;
    }
}
