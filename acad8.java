public class acad8 {
   void sortDescending(int[] array) {
       for (int i=0; i < array.length; i++)
           for (int j=i; j < array.length; j++) {
               if (array[i] < array[j]) {
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
   }

   public static void main(String [] args) {
       acad8 obj = new acad8();
       int [] array = { 23, 15, 11, 75, 52, 71, 95, 35, 6};
       obj.sortDescending(array);
       System.out.println("Array Elements in descending order are: ");
       for (int i=0; i < array.length; i++) {
           System.out.println(array[i]);
       }
   }
}
      
