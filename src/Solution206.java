public class Solution206 {

//    206: https://leetcode.com/problems/reverse-linked-list/
//    Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//    Memory Usage: 38.7 MB, less than 77.05% of Java online submissions for Reverse Linked List.


     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode reverseList(ListNode head) {

        ListNode headNow = null;
        ListNode targetNode = head;

         while (targetNode!=null){
             ListNode nextNode = targetNode.next;
             targetNode.next = headNow;
             headNow = targetNode;
             targetNode = nextNode;
         }
         return headNow;

    }





}
