import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double exchangeRate = 83.0; // 1 USD = 83 INR

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * exchangeRate;

        System.out.println("Converted Amount in INR: ₹" + inr);

        sc.close();
    }
}
