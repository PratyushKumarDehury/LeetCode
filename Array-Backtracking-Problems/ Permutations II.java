class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> ans = new HashSet();
        // calls the helper method to generate all unique permutations
        helper(nums,0,ans);
        // converted ans to ArrayList
        return new ArrayList(ans);
    }
    // recursive fun & generate permutations until the abse case is met.
    public void helper(int[] nums,int index,Set<List<Integer>>ans){
        if(index == nums.length){
            ArrayList<Integer>list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            
            ans.add(list);
            return;
        }

        // added to the ans
        for(int i = index; i < nums.length; i++){
            swap(i,index,nums);
            helper(nums,index+1,ans);
            swap(i,index,nums);
        }
    }
    public static void swap(int i, int j, int[]nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

// to avoid duplicate permutations by using HashSet to store the unuque permutations list.

// T.C -> O(n)
// S.C -> O(n)