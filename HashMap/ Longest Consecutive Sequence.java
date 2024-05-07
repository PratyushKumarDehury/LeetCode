class Solution {
    public int longestConsecutive(int[] nums) {

        // Iterative Approach
        // base cases
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        // sort the array
        Arrays.sort(nums);
        // traverse and sort the array and print the distinct elements
        nums = Arrays.stream(nums).distinct().toArray();

        int count = 1, max = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] - nums[i] == 1){
                count++;
                max = Math.max(count, max);
            }else{
                count = 1;
            }
        }
        return max;
    }
}


//         Set<Integer>hashSet = new HashSet<Integer>();
//         for(int num : nums){
//             hashSet.add(num);//add all the elements in hashset here.
//         }
//         int longeststreak = 0;
//         for(int num : nums){
//             if(!hashSet.contains(num-1)){
//                 int currentnum = num;
//                 int currentstreak = 1;

//                 while(hashSet.contains(currentnum+1)){
//                     currentnum++;
//                     currentstreak++;
//                 }
//                 longeststreak = Math.max(longeststreak, currentstreak);
//             }
//         }
//         return longeststreak;
        
//     }
// }
// T.C -> O(N)
// S.C -> O(1)
