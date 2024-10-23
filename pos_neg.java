import java.util.Scanner;

public class pos_neg{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number");
        double number=s.nextDouble();

        if(number<=0)
        {
            System.out.println("Negative number: "+number);
        }
        else
        {System.out.println("Positive Number: "+number);}
    }
}