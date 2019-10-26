class Solution {
    public int movesToMakeZigzag(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int oddMove = 0;
        int evenMove = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(i % 2 == 0) {
                if(i == 0) {
                    evenMove += nums[i] >= nums[i + 1] ? nums[i] - nums[i + 1] + 1 : 0;
                } else if(i == nums.length - 1) {
                    evenMove += nums[i] >= nums[i - 1] ? nums[i] - nums[i - 1] + 1 : 0;
                } else {
                    evenMove += nums[i] >= Math.min(nums[i - 1], nums[i + 1]) ? nums[i] - Math.min(nums[i - 1], nums[i + 1]) + 1 : 0;
                }
            } else {
                if(i == nums.length - 1) {
                    oddMove += nums[i] >= nums[i - 1] ? nums[i] - nums[i - 1] + 1 : 0;
                } else {
                    oddMove += nums[i] >= Math.min(nums[i - 1], nums[i + 1]) ? nums[i] - Math.min(nums[i - 1], nums[i + 1]) + 1 : 0;
                }
            }
        }
        return Math.min(oddMove, evenMove);
    }
}