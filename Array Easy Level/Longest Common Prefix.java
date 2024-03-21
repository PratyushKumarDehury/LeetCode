class Solution {
    public String longestCommonPrefix(String[] str) {

        StringBuilder ans =  new StringBuilder();
        // sort the array
        Arrays.sort(str);
        // get the first and last strings
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();

        // start compairing
        for(int i = 0; i< first.length; i++){
            if(first[i] != last[i])
            break;
            ans.append(first[i]);
        }
        // final string result
        return ans.toString();        
    }
}

// T.C -> O(nlogn)
// S.C -> O(1)