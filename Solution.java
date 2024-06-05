class Solution {
    public int minStartValue(int[] nums) {
        int ans = 0;
        outer: for (int startValue = 1; startValue <= 10_001; startValue++) {
            int sum = startValue;
            for (int x : nums) {
                sum += x;
                if (sum < 1) {
                    continue outer;
                }
            }
            ans = startValue;
            break;
        }
        return ans;
    }
}
