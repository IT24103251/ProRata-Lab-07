// IT24103251 - Lab 7 Question 2B
// Program to print numbers 1-5 with stars
public class IT24103251Lab7Q2B
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(i + " - ");

            // row i gets i number of stars
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}