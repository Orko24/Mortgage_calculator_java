import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a Principle between 1,000 and 1,000,000: ");
        long Principle = scanner.nextLong();

        while (Principle < 1000 || Principle > 1_000_000){

            System.out.print("Please enter a Principle between 1,000 and 1,000,000: ");
            Principle = scanner.nextLong();
        }

        System.out.print("Please enter an Annual Interest Rate between 0 and 30: ");
        double Annual_Interest_Rate = scanner.nextDouble();

        while (Annual_Interest_Rate < 0 || Annual_Interest_Rate > 30){
            System.out.print("Please enter an Annual Interest Rate between 0 and 30: ");
            Annual_Interest_Rate = scanner.nextDouble();
        }

        Annual_Interest_Rate = Annual_Interest_Rate/100;

        System.out.print("Please enter a Period (Years) between 1 and 30: ");
        long Period = scanner.nextLong();

        while (Period < 1 || Period > 30){
            System.out.print("Please enter a Period (Years) between 1 and 30: ");
            Period = scanner.nextLong();
        }


        double monthly_interest = Annual_Interest_Rate/12;
        long total_months = Period * 12;
        double interest_count = ((monthly_interest * Math.pow((1+monthly_interest), total_months))
                / (Math.pow((1+monthly_interest), total_months) - 1)) ;

        float Mortgage = (float)Principle * (float)interest_count;
        System.out.println("Mortgage: " + Mortgage);
    }
}