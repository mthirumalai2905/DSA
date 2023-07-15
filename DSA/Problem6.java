public class Problem6 {
    public static int maxProduct(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 7, 4, 8};
        int maxProduct = maxProduct(nums);
        System.out.println("Max Product: " + maxProduct);
    }
}
