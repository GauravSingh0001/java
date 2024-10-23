import java.util.*;
public class hallow_rectangle {
    public static void hallow(int rows,int column){
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < column; j++) {

                if (i==0 || i==(rows-1) || j==0 || j==(column-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        hallow(4,6);
    }
}
