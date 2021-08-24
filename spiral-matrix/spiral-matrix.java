class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) return null;
        
        ArrayList<Integer> nums = new ArrayList<>();
        // System.out.println(matrix[0].length);
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        
        int size = matrix.length * matrix[0].length;
        
        while(nums.size() < size){
            for(int i=left; i<=right && nums.size() < size; i++){
                nums.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom && nums.size() < size; i++){
                nums.add(matrix[i][right]);
            }
            right--;
            for(int i=right; i>=left && nums.size() < size; i--){
                nums.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top && nums.size() < size; i--){
                nums.add(matrix[i][left]);
            }
            left++;
            display(nums);
        }
        return nums;
    }
    
    public void display(ArrayList<Integer> list){
        for(int i: list)
            System.out.print(i+" ");
    }
}