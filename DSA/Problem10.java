public class Problem10 {


    public static int maxEleArray(int[] arr){
      int maxElement = arr[0];
      for(int i =1; i < arr.length; i++){
        if(arr[i] > maxElement){
            maxElement = arr[i];
        }
      }
      return maxElement;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result = maxEleArray(arr);
        System.out.println(result);
    }
}
