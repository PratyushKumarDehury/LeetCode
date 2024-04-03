/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        // Iterative/Simple Approach

//         int count = 0;
//         ListNode temp = head;
//         while(temp != null){
//             count++;
//             temp = temp.next;
//         }
//         count  = count/2;
//         temp = head;
//         while(count-- > 0){
//             temp = temp.next;
//         }
//         return temp;
//     }
// }

// Two Pointer Method

ListNode slow = head;
ListNode fast = slow;

while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
}
}

// T.C -> O(N)
// S.C -> O(1)


        
