public int longestSubarrayWithSumLessThanOrEqualToK(int[] nums, int k) {
    int maxlen = 0;
    int n = nums.length;


    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum <= k) {
                maxlen = Math.max(maxlen, j - i + 1);
            } else {
                break; // If sum exceeds k, stop checking further in this subarray
            }
        }
    }
    
    return maxlen;
}
