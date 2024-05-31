class Solution {
    public int minAnagramLength(String s) {
        
        int n = s.length();
        for(int i = 1; i < n; i++){
            if(n%i == 0 && check(s,i))
            return i;
        }
        return n;
    }
    private boolean check(String s, int k){
        int [] count  = new int[26];
        for(int i = 0; i < k; i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = k; i < s.length(); i+=k){
             int [] count2  = new int[26];
             for(int j = i; j < i+k; j++){
                 count2[s.charAt(j) - 'a']++;
             }
             for(int j = 0; j < 26; j++){
                if(count[j] != count2[j])
                return false;
             }

        }
        return true;
    
        
        
    }
}