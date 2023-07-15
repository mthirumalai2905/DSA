import java.util.Arrays;

public class Problem4 {
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        

        int index = 1;
        for (int i = 0; i < n-1; i++) {
            if (array[i] != array[i + 1]) {
                array[index++] = array[i];
            }
        }

        return Arrays.copyOf(array, index);
    }


    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,4,4,5,55};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}


