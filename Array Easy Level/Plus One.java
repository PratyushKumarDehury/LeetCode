class Solution {
    public int[] plusOne(int[] digits) {

        // I/P: digits: [1,2,3]
        // O/P: output: [1,2,4]
        
        for(int i = digits.length-1;  i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}

// T.C -> O(N)
// S.C -> O(N)