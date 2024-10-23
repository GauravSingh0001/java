import java.util.Scanner;
public class Area_Square {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the side of Sqaure:");
        double side=s.nextDouble();
        double Area=(side*side);
        System.out.println("Area of square side"+side+":"+Area);

        
    }
}