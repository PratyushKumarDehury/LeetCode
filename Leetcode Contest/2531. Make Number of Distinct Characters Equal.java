You are given two 0-indexed strings word1 and word2.

A move consists of choosing two indices i and j such that 0 <= i < word1.length and 0 <= j < word2.length and swapping word1[i] with word2[j].

Return true if it is possible to get the number of distinct characters in word1 and word2 to be equal with exactly one move. Return false otherwise.

 

Example 1:

Input: word1 = "ac", word2 = "b"
Output: false
Explanation: Any pair of swaps would yield two distinct characters in the first string, and one in the second string.
Example 2:

Input: word1 = "abcc", word2 = "aab"
Output: true
Explanation: We swap index 2 of the first string with index 0 of the second string. The resulting strings are word1 = "abac" and word2 = "cab", which both have 3 distinct characters.
Example 3:

Input: word1 = "abcde", word2 = "fghij"
Output: true
Explanation: Both resulting strings will have 5 distinct characters, regardless of which indices we swap.
 

Constraints:

1 <= word1.length, word2.length <= 105
word1 and word2 consist of only lowercase English letters.
  
  
  
  
  
  
  
  
  
  
  
  
  
  class Solution {
    public boolean isItPossible(String word1, String word2) {
        

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c:word1.toCharArray()) arr1[c - 'a']++;
        for(char c:word2.toCharArray()) arr2[c - 'a']++;

        for(int i = 0; i < 26; i++){
            if(arr1[i] == 0)
            continue;
            arr1[i]--;

             for(int j = 0; j < 26; j++){
            if(arr2[j] == 0)
            continue;
            arr2[j]--;

            arr1[j]++;
            arr2[i]++;

            if(checkforsame(arr1,arr2))
            return true;
            arr1[j]--;
            arr2[i]--;
            arr2[j]++;
            arr1[i]++;
             }
        }
        return false;
    }


    public boolean checkforsame(int[]a, int[] b) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int c : a) if(c != 0) cnt1++;
        for(int c : b) if(c != 0) cnt2++;
        return cnt1 == cnt2;

        
    }
}
  
