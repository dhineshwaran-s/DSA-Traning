package day13;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            if(a==null)
               a=headB;
            else
               a=a.next;
            if(b==null)
               b=headA;
            else
               b=b.next;
        }
        return a;
    }
} 
    

/*  
dry run
list A: 1->2->3->4 (Length = 4)
list B: 9->3->4 (Length = 3)
Intersection at node with value 3

base case: if either headA or headB is null, return null (no intersection)
a starts at headA (1), b starts at headB (9)

lets trace a and b
a=1->2->3->4->null->9->3
b=9->3->4->null->1->2->3

while loop a!=b is true until a and b point to the same node (the intersection node with value 3).
loop breaks when a and b point to the same node, which is the intersection node with value 3. The function then returns this node as the intersection point of the two linked lists.
*/