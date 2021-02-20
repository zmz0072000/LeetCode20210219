import java.util.ArrayList;
import java.util.List;

public class Solution83 {


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode deleteDuplicates(ListNode head) {

        List<Integer> list = new ArrayList<>();

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode targetNode = head.next;
        ListNode prevNode = head;
        list.add(prevNode.val);

        while (targetNode != null){

            if (list.contains(targetNode.val)){
                prevNode.next = targetNode.next;
            }
            else
            {
                list.add(targetNode.val);
                prevNode = targetNode;
            }

            targetNode = targetNode.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }

}


