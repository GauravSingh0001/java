import java.util.*;
public class Butterfly_Pattern {
    public static void pattern(int rows)
    {//upper half
        for (int i = 1; i <=rows; i++) {

            // stars - i

            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            //space - 2*(rows-i)

            for (int j = 1; j <=(2*(rows-i)); j++) {
                System.out.print(" ");
            }

            // stars - i

            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();      
    }

    //Lower Half
    for (int i =rows; i >=1; i--) {

        // stars - i

        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }

        //space - 2*(rows-i)

        for (int j =1 ; j <=(2*(rows-i)); j++) {
            System.out.print(" ");
        }

        // stars - i

        for (int j = 1; j <=i; j++) {
            System.out.print("*");
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
