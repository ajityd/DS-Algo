class Solution {
    public int romanToInt(String s) {
        int res = 0;
        char[] input = s.toCharArray();
        int curr = 0;
        int next = 0;
        
        for(int i=0; i<input.length-1; i++){
            curr = getValue(input[i]);
            next = getValue(input[i+1]);
            if(curr < next)
                res -= curr;
            else
                res += curr;
        }
        
        return res+getValue(input[input.length-1]);
    }
    
    public int getValue(Character c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return -1;
        }
    }
}