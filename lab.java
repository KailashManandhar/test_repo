import java.util.Scanner;

/**
 * Write a description of class q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lab
{
    public static void main(String[] args){
        int age; //declaring the variable
        age =18; //assigning the variable
        
        int quantity=5; //declaring and assigning
        //local variable
        
        Scanner input = new Scanner(System.in); //input
        
        
        System.out.println("Enter first number");
        int firstNum= input.nextInt(); //nextint checks the given value is string or int
        System.out.println("My first number:" + firstNum);
        
        
        System.out.println("Enter second number");
        double secondNum= input.nextDouble(); //double for decimal
        System.out.println("My second number:" + secondNum);
        
        
        System.out.println("Ask for his/her age");
        int drive= input.nextInt();
        String isValid= (drive >= 18)? "Dring is allowed" : "Driving is not allowed";
        System.out.println(isValid);
}
}