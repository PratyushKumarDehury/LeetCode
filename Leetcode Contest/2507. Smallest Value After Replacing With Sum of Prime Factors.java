You are given a positive integer n.

Continuously replace n with the sum of its prime factors.

Note that if a prime factor divides n multiple times, it should be included in the sum as many times as it divides n.
Return the smallest value n will take on.

 

Example 1:

Input: n = 15
Output: 5
Explanation: Initially, n = 15.
15 = 3 * 5, so replace n with 3 + 5 = 8.
8 = 2 * 2 * 2, so replace n with 2 + 2 + 2 = 6.
6 = 2 * 3, so replace n with 2 + 3 = 5.
5 is the smallest value n will take on.
Example 2:

Input: n = 3
Output: 3
Explanation: Initially, n = 3.
3 is the smallest value n will take on.
 

Constraints:

2 <= n <= 105
  
  
  
  
  
  
  
  
  
class Solution {
    public int smallestValue(int n) {
        int k = n;
        if(n <= 4)
        return n;
        while(true){
            int sum = 0;
            for(int i = 2; i<=n/2; i++){
                if(prime(i)){
                    while(n%i == 0){
                        sum+=i;
                        n/=i;
                        
                    }

                }
            }
            if(n == 1){
                sum-=1;
            }
            sum+=n;
            if(n == sum){
                k = sum;
                break;
            }else{
                n = sum;
                k = sum;
            }
        }
        return k;
    }
      
    public boolean prime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
