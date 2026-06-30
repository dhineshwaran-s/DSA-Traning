

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 /// greek of greek sum
class ListNodeSolution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode check1=head;
        ListNode check2=head;
        while(check2!=null && check2.next!=null){
             check1=check1.next;
             check2=check2.next.next;
        }
        return check1;
    }
} 
    

