import java.util.*;

public class Inverted_Triangle {

    public static void Triangle(int rows)
{
    for (int i = 1; i <=rows; i++) { 
        //Spcaes
        for (int j = 1; j <=(rows-i) ; j++) {  
            
            {
                System.out.print(" ");
            }  
        }
        //star
        for (int j = 1; j <=i ; j++) {  
            
            {
                System.out.print("*");
            }
        
            
            
        }
        System.out.println();
        
    }
}
    public static void main(String[] args) {

        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        Triangle(rows);
        sc.close();
        
    }
    
}

