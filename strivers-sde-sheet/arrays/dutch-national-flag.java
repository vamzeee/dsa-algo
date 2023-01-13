class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag problem
        // Can use counting sort to go through in O(2n) (not efficient)
        // Let z, o, and t be the starting points of 0, 1 and 2 subarrays.
        // We will traverse through, using o (this is the moving point).
        // If we run into a 1, we do nothing.
        // If we run into a 0, we swap it with the number at z.
        // If we run into a 2, we swap it with the number at t.
        // What we basically do, is everytime we run into a 0 or 1, we put them at
        // extreme end,
        // And we move the extreme end closer
        int z = 0;
        int o = 0;
        int t = nums.length - 1;
        while (o <= t) {
            int temp = -1;
            if (nums[o] == 1)
                o++;
            else if (nums[o] == 0) {
                temp = nums[o];
                nums[o] = nums[z];
                nums[z] = temp;
                o++;
                z++;
            } else {
                temp = nums[o];
                nums[o] = nums[t];
                nums[t] = temp;
                t--;
            }
        }

    }
}