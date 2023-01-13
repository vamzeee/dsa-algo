class Solution {
    public int findDuplicate(int[] nums) {
        int[] frequencyArr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (frequencyArr[nums[i]] != 0)
                return nums[i];
            else
                frequencyArr[nums[i]] = nums[i];
        }
        return 0;
    }
}