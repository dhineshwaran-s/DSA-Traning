 class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} 
//greek of greek sum  

class Solution {
     static int calculateLength(Node head){
        Node temp=head;
        int counter=0;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }
    public int getKthFromLast(Node head, int k) {
        // code here
        int length=calculateLength(head);
        if(k>length){
            return -1;
        }
        int steps=length-k;
        Node temp=head;
        while(steps>0){
            temp=temp.next;
            steps--;
        }
        return temp.data;
    }
}