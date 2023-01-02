You are given an array of positive integers price where price[i] denotes the price of the ith candy and a positive integer k.

The store sells baskets of k distinct candies. The tastiness of a candy basket is the smallest absolute difference of the prices of any two candies in the basket.

Return the maximum tastiness of a candy basket.

 

Example 1:

Input: price = [13,5,1,8,21,2], k = 3
Output: 8
Explanation: Choose the candies with the prices [13,5,21].
The tastiness of the candy basket is: min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
It can be proven that 8 is the maximum tastiness that can be achieved.
Example 2:

Input: price = [1,3,1], k = 2
Output: 2
Explanation: Choose the candies with the prices [1,3].
The tastiness of the candy basket is: min(|1 - 3|) = min(2) = 2.
It can be proven that 2 is the maximum tastiness that can be achieved.
Example 3:

Input: price = [7,7,7,7], k = 2
Output: 0
Explanation: Choosing any two distinct candies from the candies we have will result in a tastiness of 0.
 

Constraints:

2 <= k <= price.length <= 105
1 <= price[i] <= 109
  
  
  
  
  
  
  
  
  
  class Solution {
    public int maximumTastiness(int[] price, int k) {
        // check maximum consequtive sequence 
        // pick maximum tastiness of a candy basket distances value
        Arrays.sort(price);
        int n = price.length;
        int low = 0;
        int high =  price[n-1] - price[0];

        while(low < high){
            int mid = 1+low+(high - low)/2;
            if(searchFunction(mid,price,k)){
                low = mid;
            }else{
                high = mid-1;
            }
        }
        return low;
    }

    private boolean searchFunction(int target,int[] price,int k){
        int prev = price[0];
        int c = 1;
        for(int i = 1; i < price.length; i++){
            if(price[i] - prev >= target){
                c++;
                prev = price[i];
            }
            if(c == k)
            return true;
        }
        return false;
    }
}

//T.C ->(nlogn)
//S.C -> O(1)


