package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareOfSortedArrays {
    public static void main(String args[]) {
        int nums[] = {-4,-1,0,3,10};
        int arr[] = sortedSquares(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i : nums) {
            arr[j] = i * i;
            j++;
        }

        Arrays.sort(arr);
        return arr;
    }
}
