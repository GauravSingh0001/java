import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     
    System.out.println("Enter the Year: ");
    int year=s.nextInt();


    
    if ((year%4==0)&&((year%100==0) || (year%400==0))) {

        System.out.println(year+"is a leap year");


        
    }
    else
    System.out.println(year+"is not a leap year");
    
    }

    
}
