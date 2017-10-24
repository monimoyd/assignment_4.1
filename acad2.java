public class acad2 {
   public static void main(String [] args) {
       if (args.length != 2) {
           System.out.println("You must enter two integer arguments");
           System.exit(-1);
       }
       int num1 =  Integer.parseInt(args[0]);
       int num2 =  Integer.parseInt(args[1]);
       int sum = num1 + num2;
       System.out.println("Sum of two numbers :" + num1 + " and " + num2 + " is: " + sum);
   }
}
      
