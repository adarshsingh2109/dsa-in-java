class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;

        while (true){
            int i;
            for (i=0;i<nums.length;i++){
                if (nums[i]==multiple){
                    break;
                }
            }
            if (i==nums.length){
                return multiple;
            }
            multiple+=k;
        }
        
    }
}