import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        long Principle = scanner.nextLong();

        System.out.print("Annual Interest Rate: ");
        double Annual_Interest_Rate = scanner.nextDouble()/100;

        System.out.print("Period (Years): ");
        long Period = scanner.nextLong();

        //Varialbles:
//        M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1].
//
//        Here’s a breakdown of each of the variables:
//
//        M = Total monthly payment
//        P = The total amount of your loan
//        I = Your interest rate, as a monthly percentage
//        N = The total amount of months in your timeline for paying off your mortgage

        double monthly_interest = Annual_Interest_Rate/12;
        long total_months = Period * 12;
        double interest_count = ((monthly_interest * Math.pow((1+monthly_interest), total_months))
                / (Math.pow((1+monthly_interest), total_months) - 1)) ;

        float Mortgage = (float)Principle * (float)interest_count;
        System.out.println("Mortgage: " + Mortgage);
    }
}