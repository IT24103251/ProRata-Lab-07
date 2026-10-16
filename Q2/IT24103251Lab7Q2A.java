// IT24103251 - Lab 7 Question 2A
// Program to print a pattern of dollar signs
public class IT24103251Lab7Q2A
{
    public static void main(String[] args)
    {
        // 4 rows
        for (int i = 1; i <= 4; i++)
        {
            // each row has 5 dollar signs
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}