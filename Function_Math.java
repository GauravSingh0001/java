import java.util.*;


public class Function_Math {
    public static void main(String[] args) {

        /*  Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs()

  */

  System.out.println("Enter the total number:");
  Scanner sc=new Scanner(System.in);
  int total =sc.nextInt();
  System.out.println("Enter the numbers:");
  int a[]=new int[total];
 

  
        for (int i = 0; i < total; i++) {
            
            a[i]=sc.nextInt();
        }
        System.out.println("Mininmum: "+Math.min(a[0],a[1])); 
        System.out.println("Maximium: "+Math.max(a[0],a[1])); 
        System.out.println("Square root:"+Math.sqrt(a[0])); 
        System.out.println("Power: "+Math.pow(a[0],a[1])); 
        // System.out.println(Math.avg(a[0],a[1]));  Ther is no dedicated Average function
        System.out.println("Absolute: "+Math.abs(-a[0])); 

        
  
        
    }
    
}
