package Arrays;

public class RotateArray {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void rotateArray(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        if (nums.length != 1 && k < nums.length) {
            int[] arr = new int[nums.length];
            int j = 0;
            for (int i = nums.length - k; i < nums.length; i++) {
                arr[j] = nums[i];
                j++;
            }

            for (int i = 0; i < nums.length - k; i++) {
                arr[j] = nums[i];
                j++;
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = arr[i];
            }
        }
    }

}
