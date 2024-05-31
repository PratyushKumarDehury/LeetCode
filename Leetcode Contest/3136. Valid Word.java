class Solution {
    public boolean isValid(String word) {
       int len=word.length();
        if(len<3){
            return false;
        }
        int count=0,count1=0;
        for(int i=0;i<len;i++){
            
            char c=word.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                
                c=Character.toLowerCase(c);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                }
                else{
                    count1++;
                }
            }
            else if(c>='0' && c<='9'){
                continue;
            }
            else{
                return false;
            }
        }
        return count > 0 && count1 > 0;
        
        
    }
}


// C++ Source Code

class Solution {
public:
    bool isValid(string word) {
        
        unordered_set<char> s = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int n = word.size();
        if(n < 3) return false;
        
        bool digits = false, upperCase = false, lowerCase = false, vowel = false, consonant = false;
        
        for(auto c : word){
            if(!isdigit(c) && isalpha(c)) return false;
            if(isdigit(c)) digits = true;
            if(islower(c)) lowerCase = true;
            if(isupper(c)) upperCase = true;
            if(s.count(c)) vowel = true;
            
            else if(!s.count(c) && isalpha(c))
                consonant = true;
            
        }
        return (digits && upperCase && lowerCase && vowel && consonant);
        
    }
};