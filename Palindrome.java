import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(int number)
    { 

        String a=Integer.toString(number);
        int[] arr=new int[a.length()];

        
        for(int i=0;i<a.length();i++)
        {
         arr[i]=Character.getNumericValue(a.charAt(i));
        }
        for (int j = 0; j < arr.length/2; j++) {

                if(arr[j]!=arr[arr.length-1-j])
                {
                   return false;

                }
           
               
        } return true;

    }

    public static void main(String[] args) {
        //Write a Java program to check if a number is a palindrome in Java? ( 121 is a
//palindrome, 321 is not)
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();

        if(isPalindrome(number))
        System.out.println(number+" is a Palindrome");
        else
        System.out.println(number+" is not a Palindrome");
        




    }
    
}


