import java.util.Scanner;

public class acad5 {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Input:");
       int num =  input.nextInt();
       System.out.println("O/p: ");
       for (int i= 1; i <= 10;i++) {
           System.out.println(num + " x " +  i + " = " + (i * num));
       }
   }
}
      
