import java.util.*;

public class Floyds_Triangle {
    public static void floyd(int rows){
        int counter=1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i; j++) { 
                System.out.print(counter+" "); 
                counter++;  
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        floyd(rows);

        sc.close();
    }
    
}
