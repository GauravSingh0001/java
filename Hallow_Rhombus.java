import java.util.*;;

public class Hallow_Rhombus {

    public static void Rhombus(int n)
    {
        for(int i=1;i<=n;i++)

    {
        for (int j = 1;j <=(n-i); j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <=n; j++) {
            if(i==1 || j==n || i==n || j==1)
            { System.out.print("*");}
            else
            System.out.print(" ");
        }
        
        System.out.println();
    }
}

    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        Rhombus(rows);
        sc.close();
    }
    
}
