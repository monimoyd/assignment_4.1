import java.util.Scanner;

public class acad4 {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("First number is:");
       int num1 =  input.nextInt();
       System.out.print("Second number is:");
       int num2 =  input.nextInt();
       // Exchange the numbers if first number is greater than second number 
       if(num2 < num1) {
           int temp = num1;
           num1 = num2;
           num2 = temp;
       }
       System.out.println("Odd Numbers are:");
       for (int i= num1 + 1; i < num2;i++) {
           if (i % 2 == 1) {
               System.out.println(i);
           } 
       }

       System.out.println("Even Numbers are:");
       for (int i= num1 + 1; i < num2;i++) {
           if (i % 2 == 0) {
               System.out.println(i);
           } 
       }
 
   }
}
      
