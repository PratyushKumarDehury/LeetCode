class Solution {
    public List<List<Integer>> permute(int[] nums) {

        // Initialize an empty res list
        List<List<Integer>> res = new ArrayList<List<Integer>>();
            List <Integer> list = new ArrayList<Integer>();

        //    passing initial parameters to begin permutation process
            int[] per = new int[nums.length];
            permutations(0,nums,per,res,list);
            return res;

        }
        public void permutations(int index, int[] arr,int[] per,List<List<Integer>> res, List<Integer>list){

        
        if(list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        // Iterate through the element until the it''s not found the combinations
        for(int i = 0; i < arr.length; i++){
            if(per[i] == 0){
                per[i] = 1;
                list.add(arr[i]);
                permutations(i+1,arr,per,res,list);
                // removes the last element from the current list and marks
                list.remove(list.size()-1);
                per[i] = 0;
            }
        }
        
    }
}

// T.C -> O(n*n)
// S.C -> O(n*n)