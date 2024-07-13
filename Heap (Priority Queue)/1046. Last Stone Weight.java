class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            maxHeap.add(stone);//added all the elements maxheap.
        }
        // while loop will go continue until one stone is left become 1.
        while(maxHeap.size() != 1){
            int y = maxHeap.remove();
            int x = maxHeap.remove();
            if(x == y)
            maxHeap.add(0);
            if(x != y)
            maxHeap.add(y-x);
        }
        return maxHeap.peek();
        
    }
}

// T.C -> O(nlogn)
// S.C -> O(n)