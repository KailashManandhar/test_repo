
/**
 * variables and operators
 *
 * @author kailash
 * @version v1
 */
public class DaySecond
{
    public static void main(String[] args){
        // int, double, String, boolean;
        String name = "kailash";
        int age = 10;
        int age2 = 5;
        int add = age2 + age;
        int mult = age * age2;
        int sub = age2 - age;
        int divi = age2 / age;
        
        // scanner clads , ternery operator
        
        System.out.println("my name is:" +name + " and i am "+age+ "years old" );
        System.out.println(add + mult+ sub+ divi);
        System.out.println(age % age2);
        System.out.println(age == age2);
        System.out.println(age != age2);  
        System.out.println(age++);
        
        int h = 1;
        System.out.println(h); // h = 1
        System.out.println(++h);    // h = 
        System.out.println(h);
        System.out.println(h++);    // h =
        System.out.println(h);
    }
}