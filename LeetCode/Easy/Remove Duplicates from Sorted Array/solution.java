class Solution {
    public int removeDuplicates(int[] nums) {
         int right=1;
         int left=1;
        for (left=1;left<nums.length;left++){
            if (nums[left]!=nums[left-1]){
                nums[right]=nums[left];
                right++;
            }
        }
        return right;
    }
}