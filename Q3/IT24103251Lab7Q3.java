// IT24103251 - Lab 7 Question 3
// SunSet supermarket discount program
import java.util.Scanner;

public class IT24103251Lab7Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double billAmount, discount, amountToPay;
        char mode;

        for (int customer = 1; customer <= 5; customer++)
        {
            System.out.println("--- Customer " + customer + " ---");

            System.out.print("Enter total bill amount : ");
            billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C/O) : ");
            mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c')
            {
                // 5% discount only for cash payments
                discount = billAmount * 0.05;
                amountToPay = billAmount - discount;

                System.out.println("Discount : " + discount);
                System.out.println("Amount to be paid : " + amountToPay);
            }
            else if (mode == 'O' || mode == 'o')
            {
                // no discount for other payment modes
                System.out.println("Discount : 0.0");
                System.out.println("Amount to be paid : " + billAmount);
            }
            else
            {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}