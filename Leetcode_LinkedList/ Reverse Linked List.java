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
     public ListNode reverseList(ListNode head) {

    // Iterative Approach

//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode nextNode  = null;

//         while(curr != null){
//             nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//         }
//         head = prev;
//         return prev;
//     }
// }


//     ListNode Reverse(ListNode curr, ListNode prev){
//         if(curr == null)
//             return prev;
//             ListNode nextNode = curr.next;
//             curr.next = prev;
//             return Reverse(nextNode, curr);

//     }
//     public ListNode reverseList(ListNode head) {
//         return Reverse(head,null);
//     }
// }

class Solution {

    ListNode Reverse(ListNode curr, ListNode prev){
        if(curr == null)
            return prev;
            ListNode nextNode = curr.next;
            curr.next = prev;
            return Reverse(nextNode, curr);

    }
    public ListNode reverseList(ListNode head) {
        return Reverse(head,null);
    }
}

// T.C -> O(N)
// S.C -> O(1)



