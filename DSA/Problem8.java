public class Problem8 {
    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        boolean isUniqueArray = isUnique(intArray);
        System.out.println("Is array unique? " + isUniqueArray);
    }
}
