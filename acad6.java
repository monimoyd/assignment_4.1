public class acad6 {
   int sum(int num1, int num2) {
       return num1 + num2;
   }

   float sum(float num1, float num2) {
       return num1 + num2;
   }

   public static void main(String [] args) {
       acad6 obj = new acad6();
       int sum1 = obj.sum(4, 11);
       float sum2 =obj.sum(6.05f, 15.27f);
       System.out.println("Sum of two integers 4 and 11 is: " + sum1);
       System.out.println("Sum of two floating point numbers 6.05 and 15.27 is: " + sum2);
   }
}
      
