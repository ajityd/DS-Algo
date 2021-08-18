class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = 1;
        
        int len = nums.length;
        while(second < nums.length){
            if(nums[first] != nums[second]){
                first++;
                nums[first] = nums[second];
            }
            second++;
        }
        return first+1;
        
    }
}