import java.util.Scanner;
public class GST {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the price of Pencil:");
        double Pencil=s.nextDouble();
        System.out.println("Enter the price of Pen:");
        double Pen=s.nextDouble();
        System.out.println("Enter the price of Eraser:");
        double Eraser=s.nextDouble();

        double Total=Pencil+Pen+Eraser;
        double GST=Total*0.18;

       
        System.out.println("Subtotal:"+Total+"\nGST:"+GST+"\nTotal:"+(Total+GST));

    
    }
}
