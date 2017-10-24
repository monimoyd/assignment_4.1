import java.util.Scanner;

public class acad3 {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("First number is:");
       int num1 =  input.nextInt();
       System.out.print("Second number is:");
       int num2 =  input.nextInt();
       int sum = num1 + num2;
       System.out.println("Sum is:" +  sum);
   }
}
      
