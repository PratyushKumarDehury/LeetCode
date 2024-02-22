class Solution {
    public void rotate(int[] nums, int k) {



        k = k % nums.length;
        int n = nums.length;

        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    public void reverseNum(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // T.C -> O(N)
    // S.C -> O(1)
        
        



        // k = k%nums.length;

        // reverse(nums.begin(), nums.end());
        // reverse(nums.begin(), nums.begin()+k);
        // reverse(nums.begin()+k, nums.end());
        
        
    }
