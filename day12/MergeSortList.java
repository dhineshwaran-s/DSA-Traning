package day12;

public class MergeSortList {
        class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }

    class Solution {
        public Node flatten(Node root) {
            // code here
            if(root==null || root.next==null)
            return root;
            root.next=flatten(root.next);
            root=mergeTwoList(root,root.next);
            root.next=null;
            return root;
        }
        Node mergeTwoList(Node a,Node b){
            if(a==null)
                return b;
            if(b==null)
                return a;
            Node temp;
            if(a.data<b.data){
                temp=a;
                temp.bottom=mergeTwoList(a.bottom,b);
            }
            else{
                temp=b;
                temp.bottom=mergeTwoList(a,b.bottom);
            }
            return temp;
        }
    }
}
