// IT24103251 - Lab 7 Question 1B
// Grades for 3 students, marks entered in a single line
import java.util.Scanner;

public class IT24103251Lab7Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        for (int student = 1; student <= 3; student++)
        {
            System.out.println("--- Student " + student + " ---");

            System.out.print("Enter marks for 4 subjects : ");
            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

            average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average marks : " + average);

            if (average >= 75 && average <= 100)
            {
                System.out.println("Grade : Distinction");
            }
            else if (average >= 50)
            {
                System.out.println("Grade : Credit");
            }
            else
            {
                System.out.println("Grade : Fail");
            }
            System.out.println();
        }
    }
}