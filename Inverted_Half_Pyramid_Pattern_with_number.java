import java.util.*;
public class Inverted_Half_Pyramid_Pattern_with_number{

    public static void pattern(int rows){
        for (int i = 0; i <=rows; i++) {
            for (int j = 1; j <=(rows-i); j++) {
                System.out.print(j);
                
            }
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        pattern(rows);
        sc.close();
    }
}