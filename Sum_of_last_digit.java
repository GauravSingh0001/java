import java.util.*;
public class Sum_of_last_digit {
/*Write a Java method to compute the sum of the digits in an integer.
(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a & b until the number becomes 0 ) */

public static int function(int number )
{
    int last_digit=(number%10);
    while(last_digit!=0) {
        number+=last_digit;
        last_digit=(number%10);
    } 

    return number;
}

public static void main(String[] args) {
    System.out.println("Enter the number: ");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();

    int answer=function(number);
    System.out.println("Result: "+answer);
    
}

    
}
