package Arrays;

public class MaximumSumSubarray {
    public static void main(String args[]) {
        int nums[] = { -2, -1 };
        int ans = maximumSUmSubarray(nums);
        System.out.println("Maximux  = " + ans);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }

    private static int maximumSUmSubarray(int[] arr) {
        int sum = 0;
        int count = 0;
        int ans = 0;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MIN_VALUE;

        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if (sum <= 0) {
                    count++;
                    mn = Math.max(mn, arr[i]);
                    System.out.println("sum " + sum + " Min " + mn);

                    sum = 0;

                }
                mx = Math.max(mx, sum);

            }
        } else {
            return arr[0];
        }
        ans = mx;
        if (count == arr.length) {
            ans = mn;
            System.out.println("mini --- ");
        }

        return ans;
    }
}
