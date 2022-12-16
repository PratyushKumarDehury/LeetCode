Given an integer array nums and an integer k, return the number of subarrays of nums where the least common multiple of the subarray's elements is k.

A subarray is a contiguous non-empty sequence of elements within an array.

The least common multiple of an array is the smallest positive integer that is divisible by all the array elements.

 

Example 1:

Input: nums = [3,6,2,7,1], k = 6
Output: 4
Explanation: The subarrays of nums where 6 is the least common multiple of all the subarray's elements are:
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]
- [3,6,2,7,1]
Example 2:

Input: nums = [3], k = 2
Output: 0
Explanation: There are no subarrays of nums where 2 is the least common multiple of all the subarray's elements.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i], k <= 1000
  
  
  
  
  
  
  
  
  
class Solution {

 
    public int subarrayLCM(int[] nums, int k) {
    
        int ans=0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int lcm=1;
            for(int j=i;j<n && lcm<=k;j++){
                lcm=LCM(lcm, nums[j]);
                ans += (lcm == k) ? 1:0;
            }
        }
        return ans;
    }



    public int gcd(int a, int b){
        if(b==0)
        return a;
        return gcd(b, a % b);
    }
    public int LCM(int a, int b){

        return (a*b) / gcd(a,b);
    }
}

   


//LCM-->

// T.C -> O(N)
// S.C -> O(1)
