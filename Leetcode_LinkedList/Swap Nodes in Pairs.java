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
    public ListNode swapPairs(ListNode head) {

        // Itervative Approach

//         ListNode prev  = null;
//         ListNode curr = head;
//         ListNode next = null;

//         int count = 0;

//         while(curr != null && count < 2){
//             next  = curr.next;;
//             curr.next  = prev;
//             prev = curr;
//             curr = next;
//             count++;
//         }

        
//         if(next != null){
//             head.next = swapPairs(next);    
//     }
//     return prev;
//     }
// }

// Recursive Approach 

// base case
if(head == null || head.next == null){
    return head;
}
ListNode temp = head.next;
head.next = swapPairs(head.next.next);
temp.next = head;
return temp;
    }
}

// T.C -> O(N)
// S.C -> O(1)


