You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k. Each minute, 
you may take either the leftmost character of s, or the rightmost character of s.

Return the minimum number of minutes needed for you to take at least k of each character, or return -1 if it is not possible to take k of each character.

 

Example 1:

Input: s = "aabaaaacaabc", k = 2
Output: 8
Explanation: 
Take three characters from the left of s. You now have two 'a' characters, and one 'b' character.
Take five characters from the right of s. You now have four 'a' characters, two 'b' characters, and two 'c' characters.
A total of 3 + 5 = 8 minutes is needed.
It can be proven that 8 is the minimum number of minutes needed.
Example 2:

Input: s = "a", k = 1
Output: -1
Explanation: It is not possible to take one 'b' or 'c' so return -1.
 

Constraints:

1 <= s.length <= 105
s consists of only the letters 'a', 'b', and 'c'.
0 <= k <= s.length













class Solution {
    public int takeCharacters(String s, int k) {

        int N = s.length();
        int j = 0;
        int ans = N+1;
        int window = 0;
        Map<Character,Integer > count = new HashMap<Character,Integer>();

        for(int i = 0; i < N; i++)
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0) + 1);

            if((count.getOrDefault('a',0) < k) || (count.getOrDefault('b',0) < k) || (count.getOrDefault('c',0) < k))

            return -1;
        
        for(int i = 0; i < N; i++){
            char c = s.charAt(i);
            count.put(c,count.get(c)-1);
            window++;

            while(count.get(c) < k){
                count.put(s.charAt(j),count.get(s.charAt(j)) + 1);
                window--;
                j++;
            }
            ans = Math.min(ans,N-window);
        }
        return ans;
    }
}
// T.C -> O(N)
// S.C -> O(1)
