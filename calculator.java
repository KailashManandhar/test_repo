import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("the number is "+num1);
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println("enter second number");
        System.out.println("the number is "+num2);
    }
}