
/**
 * Write a description of class TutorialC4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC4
{
    int age; // instance variable
    static int qty; // static variable
    public static void main(String[] args)
    {
        int i = 0;
        double j = i;// implicit type casting. sano datatype --> thulo datatype
        System.out.println(j);
        int k = 5;
        byte l = (byte)k; // explicit type casting. thulo datatype --> sano datatype
        System.out.println(l);
        
        // exceptions in arithmetic
        byte bt = 10;
        byte btr = 11;
        
        byte sum = (byte)(bt + btr); // when u add byte data value, it returns integer. so thulo to sano is explicit.
        System.out.println(sum);
        
        short kai = 10;
        short pai = 11;
        
        short sum1 = (short)(kai + pai); // same exception for short
        System.out.println(sum1);
        
        char let1 = 'A';
        char let2 = 'B';
        char sum2 = (char)(let2 - let1);
    
        System.out.println("char wala "+(int)sum2);
        
        
        // max, min, size and bytes
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        
        
        // EXCAPE SEQUENCE
        System.out.println("hello\nworld");
        System.out.println(l);
        
        
        
        // unicode escape sequence
        System.out.println("\u2769");
        
    }
}