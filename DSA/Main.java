

public class Main{
    public static void main(String[] args){
         SingleDimensionArray sda = new SingleDimensionArray(10);
         sda.insert(0,0);
         sda.insert(1,10);
         sda.insert(2,20);
         sda.insert(3,30);

         int a = sda.arr[1];
         System.out.println(a);
         int b = sda.arr[9];
         System.out.println(b);


         System.out.println("Array traversal");
         sda.traversalArray();


         sda.searchArray(20);
    }


}