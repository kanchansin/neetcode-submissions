class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=nums.length-1; j>=0; j--){
                int sum = nums[i]+nums[j];
                if(sum==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
