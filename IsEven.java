
import java.util.*;

public class IsEven {

    public static boolean IsEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
        return false;}
    }

    public static void main(String[] args) {
       /*Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
 */ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean a=IsEven(num);
        System.out.println(a);
  }
    
}
