class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNum = new HashSet<>();
        for(int num: nums){
            if(seenNum.contains(num)){
                return true;
            }
            seenNum.add(num);
        }
        return false;
    }
}