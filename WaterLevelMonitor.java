import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int level = 50;
 
        System.out.println("level: "+level);
        System.out.println("new water level: ");
            
        int new_level = input.nextInt();
        String status = ((new_level+level)>= 1000)?"WARNING":"normal";
        System.out.println(status);
        
    }
}