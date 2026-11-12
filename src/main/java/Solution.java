class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a = 1;
        int d = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            int p = nums[i - 1];
            if (nums[i] == p) {
                a = 1;
                d = 1;
            } else if (nums[i] > p) {
                a++;
                d = 1;
            } else {
                d++;
                a = 1;
            }
            res = Math.max(res, Math.max(a, d));
        }
        return res;
    }
}