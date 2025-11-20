import java.util.Scanner;
import java.util.HashMap;
/**
 * Write a description of class Ausadhi_Pasal here.
 *
 * @author (Kailash Manandhar)
 * @version (a version number or a date)
 */
public class Ausadhi_Pasal
{
    public static void main(String[] args)
    {
        String med_name;
        int price = 0;
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> medication = new HashMap<>();
        System.out.println("how many medicines? ");
        int med_count = input.nextInt();
        for ( int i = 0; i < med_count; i++)
        {
            input.nextLine(); // yo kina gareko?
            
            
            System.out.println("Medicine Name: ");
            med_name =input.nextLine();
            System.out.println("price: ");
            price = input.nextInt();
            medication.put(med_name, price);
        }
        
        for (String name: medication.keySet())
        {
            System.out.println(name+" : " + medication.get(name));
        }
    }
}