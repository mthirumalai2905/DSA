public class Problem11 {
     public static int sumOfArr(int[] arr) {
        int total_sum = 0;
        for(int num : arr){
             total_sum += num;
        }
        return total_sum;
    }


     public static int productOfArr(int[] arr) {
        int product = 1;
        for(int num : arr){
             product *= num;
        }
        return product;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result = sumOfArr(arr);
        System.out.println(result);
        int result1 = productOfArr(arr);
        System.out.println(result1);
    }

   
    
}
