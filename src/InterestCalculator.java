import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.println("Enter numbers of month: ");
        int month= scanner.nextInt();
        System.out.println("Enter yearly interest rate: ");
        double rate= scanner.nextDouble();
        double totalInterest;

            totalInterest = money * (rate/100)/12 * month;

        System.out.println("Total interest is "+totalInterest);

    }
}
