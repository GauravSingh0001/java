import java.util.Scanner;

public class Sum{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=S.nextInt();
        System.out.println("Enter Second Number:");
        int b=S.nextInt();
        System.out.println("Sum"+(a+b));
        System.out.println("Product"+(a*b));


    }
}