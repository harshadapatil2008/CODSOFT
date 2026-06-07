import java.util.Scanner;

// CodSoft Java Internship - Task 3

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      CURRENCY CONVERTER");
        System.out.println("=================================");
        System.out.println("USD to INR Conversion");

        double exchangeRate = 83.0;

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * exchangeRate;

        System.out.println("\n========== RESULT ==========");
        System.out.println("USD Amount : $" + usd);
        System.out.println("INR Amount : ₹" + inr);
        System.out.println("============================");
        System.out.println("Thank you for using Currency Converter!");

        sc.close();
    }
}