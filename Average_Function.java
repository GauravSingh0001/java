import java.util.*;

public class Average_Function {

    public static int Average(){

        int sum=0; 
        int a[];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size=sc.nextInt();

        a=new int[size];
        

        for(int i=0;i<(size);i++)
        {System.out.println("Enter the number");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            sum+=a[i];
        }

        int avg=sum/size;

        return avg;
    }
    public static void main(String[] args) {

        

       int result= Average();

       System.out.println("Average:"+result);
        
    }
    
}
