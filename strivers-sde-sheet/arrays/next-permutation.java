class Solution {
    public void nextPermutation(int[] nums) {
        // step 1 : find the longest weakly decreasing subarray,
        // step 2 : find the pivot
        // step 3 : find the smallest number in the subarray which is greater than pivot
        // (rightmost)
        // step 4 : swap the pivot with it
        // step 5 : reverse the subarray
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i])
            i--;
        // now i is at the head of suffix
        // nums[i-1] is the pivot
        if (i > 0) {
            int j = nums.length - 1;
            while (nums[i - 1] >= nums[j])
                j--;
            // j is the new pivot (rightmost)
            int temp = nums[i - 1];
            nums[i - 1] = nums[j];
            nums[j] = temp;
        }
        int j = nums.length - 1;
        while (j > i) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}