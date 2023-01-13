class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's algorithm O(n)
        // We start iterating from the left, and we keep calculating a running sum.
        // If at any point, the running sum becomes more than the max sum (set to
        // -infinity),
        // then we set the max sum as running sum and move on.
        // But if at any point, the running sum goes below 0, we drop the current sub
        // array.
        // This is because if we continue adding a subarray to a negative number, the
        // total would be
        // less than the subarray alone.
        int output = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum > output)
                output = currSum;

            if (currSum < 0)
                currSum = 0;
        }

        return output;
    }
}
