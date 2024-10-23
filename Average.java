import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        // In a program, input 3 numbers : A, B and C. You have to output the average of
//these 3 numbers.

Scanner s=new Scanner(System.in);

System.out.println("Enter three number a,b,c:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
double Average=(a+b+c)/3.0;
System.out.println("Average of:"+((a+b+c)/3));
System.out.println("Average:"+Average);

    }
    
}
