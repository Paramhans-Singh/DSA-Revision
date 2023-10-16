public class MaximumSumofNotAdajacent {
    public static int SumRec(int nums[], int n) {
        n = nums.length - 1;

        if (n == 0) {
            return nums[0];
        }
        if (n < 0) {
            return 0;
        }

        int pick = nums[n] + SumRec(nums, n - 2);
        int notpick = 0 + SumRec(nums, n - 1);

        return Math.max(pick, notpick);
    }

    public static int SumOptimal(int nums[]) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i]+prev2;
            // if (i > 1)
                // pick += prev2;

            int notpick = 0 + prev;

            int curr = Math.max(pick, notpick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}

// Leetcode - HouseRobber