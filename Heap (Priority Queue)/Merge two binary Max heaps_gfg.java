
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int z: a)
        pq.add(z);
        
        for(int z: b)
        pq.add(z);
        
        int ans[] = new int [n+m];
        
        int i = 0;
        while(!pq.isEmpty()){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
        
        // Not passed all the test cases and shows run time error.
        
        // int i = 0;
        // int j = 0;
        // int x = 0;
        
        // int arr[] = new int[m+n];
        // while(i < a.length && j < b.length){
        //     if(a[i] > b[j]){
        //         arr[x] = a[i];
        //         i++;
        //     }else{
        //         arr[x] = b[j];
        //         j++;
        //     }
        //     x++;
        // }
        // while(i < a.length){
        //     arr[x] = a[i];
        //     i++;
        //     x++;
        // }
        //  while(j < b.length){
        //     arr[x] = b[i];
        //     j++;
        //     x++;
        // }
        // return arr;
        
    }
}