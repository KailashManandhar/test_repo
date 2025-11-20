import java.util.Scanner;

/**
 * Write a description of class rikshaw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rikshaw
{
    public static void main(String[] args)
    {
        int base_fare = 20;
        Scanner input = new Scanner(System.in);
        System.out.println("what is the distance?");
        int distance = input.nextInt();
        System.out.println("are you a local?\n 1 for yes , 0 for no");
        int answer =input.nextInt();
        boolean local;
        boolean day;
        if ( answer == 1)
        {
            local = true;
        }
        else
        {
            local = false;
        }
        System.out.println("Is it day or night?\n 1 for day,0 for night");
        int answer1 = input.nextInt();
        if ( answer1 == 1)
        {
            day = true;
        }
        else
        {
            day = false;
        }
        float price_multiplier = 0;
        float price_multiplier1 = 0;
        if (day)
        {
            price_multiplier = 1;
        }
        else
        {
            price_multiplier = 1.5f;
        }
        if (local)
        {
            price_multiplier1 = 0.8f;
        }
        else
        {
            price_multiplier1 = 1;
        }
        double fare = (((distance - 1) * 5) +base_fare) * price_multiplier * price_multiplier1;
        System.out.println("Total fare: Rs"+fare);
    }
}