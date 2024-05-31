class Solution {
    public int maximumEnergy(int[] energy, int k) {
        
      int n = energy.length;
        int[] dp = new int[n];

        int ans =  Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            dp[i] = energy[i] + (i+k<n ? dp[i+k]: 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
        
    }
}

// C++ Source Code

class Solution {
public:
    int maximumEnergy(vector<int>& energy, int k) {
        
         int ans  = INT_MIN;
        for(int i = energy.size()-1; i > energy.size()-1-k; i--){
            for(int j = i, sum = 0; j >= 0; j-=k){
            sum += energy[j];
            ans = max(ans,sum);
        }
        }
        return ans;
        
    }
};


