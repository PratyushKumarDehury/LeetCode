class Solution {
public:
    int findPermutationDifference(string s, string t) {
        
        unordered_map<char, int> s1, t1;
        int n = s.size();
        for(int i = 0; i < n; i++){
            s1[s[i]] = i;
            t1[t[i]] = i;
        }
        
        int ans = 0;
        for(auto x : s1){
            ans += abs(x.second - t1[x.first]);
        }
        return ans;
    }
};