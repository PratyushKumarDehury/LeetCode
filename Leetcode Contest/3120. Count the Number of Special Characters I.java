class Solution {
    public int numberOfSpecialChars(String word) {
        
        int[] lower = new int[26];
        int[] upper = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i;
            } else {
                upper[ch - 'A'] = i;
            }
        }

        int ans = 0;
        for (int ch = 0; ch < 26; ch++) {
            if (lower[ch] != -1 && upper[ch] != -1) {
                ans++;
            }
        }
        return ans;
    
        
    }
}