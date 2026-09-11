import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the present value of the account: ");
        double presentvalue = input.nextDouble();
        System.out.println("What is the monthly interest rate: ");
        double interestrate = input.nextDouble();
        interestrate=interestrate/100;
        System.out.println("What is the number of months that the money will be left in the account: ");
        double months = input.nextDouble();
        double futurevalue = presentvalue * Math.pow(1+interestrate,months);
        System.out.printf("The Future value of the account is: %.2f", futurevalue);
    }
}
