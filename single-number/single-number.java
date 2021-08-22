class Solution {
    public int singleNumber(int[] nums) {
        // int[] newArr = new int[nums/2 + 1];
        Arrays.sort(nums);
        int result = 0;
        int index = 0;
        while(index < nums.length-1){
            if(nums[index] == nums[index+1])
                index += 2;
            else{
                return nums[index]; 
            } 
               
        }
     return nums[nums.length-1];   
    }
}