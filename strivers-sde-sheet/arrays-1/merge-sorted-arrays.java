class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> output = new ArrayList<>();
        // initiating pos to keep track of the index in the second array
        if (nums1.length == 0) {
            nums1 = nums2;
            return;
        } else if (nums2.length == 0) {
            return;
        }
        int pos = 0;
        for (int i = 0; i < m; i++) {
            while (pos < n && nums1[i] >= nums2[pos]) {
                output.add(nums2[pos]);
                pos++;
            }
            output.add(nums1[i]);
        }
        if (pos < n) {
            for (int i = pos; i < n; i++) {
                output.add(nums2[i]);
            }
        }
        for (int i = 0; i < output.size(); i++) {
            nums1[i] = output.get(i);
        }
    }
}