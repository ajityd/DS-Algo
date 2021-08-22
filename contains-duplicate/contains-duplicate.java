class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length  <= 1) return false;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        if(nums[nums.length -2] == nums[nums.length-1]) return true;
        else return false;
    }
}