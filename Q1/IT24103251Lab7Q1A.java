// IT24103251- Lab 7 Question 1A
// Program to find the average of 4 subjects and display the grade
import java.util.Scanner;

public class IT24103251Lab7Q1A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        // get the marks from the user
        System.out.print("Enter marks for subject 1 : ");
        mark1 = input.nextInt();

        System.out.print("Enter marks for subject 2 : ");
        mark2 = input.nextInt();

        System.out.print("Enter marks for subject 3 : ");
        mark3 = input.nextInt();

        System.out.print("Enter marks for subject 4 : ");
        mark4 = input.nextInt();

        // calculate the average (4.0 used to get the decimal part)
        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("Average marks : " + average);

        // check the grade starting from the highest range
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
    }
}