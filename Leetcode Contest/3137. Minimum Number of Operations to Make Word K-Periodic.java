class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        
        Map<String, Integer>map = new HashMap<>();
        int n = word.length(), mx = 0;

        for(int i = 0; i < n; i+=k){
            String s = word.substring(i, i+k);
            map.put(s, map.getOrDefault(s,0) +1);
            mx = Math.max(mx, map.get(s));
        }
        return (n/k - mx);
        
    }
}