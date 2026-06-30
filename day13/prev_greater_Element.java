package day13;
import java.util.ArrayList; 
import java.util.Stack;

class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res.add(-1);
            }
            else{
                res.add(st.peek());
            }
            st.push(arr[i]);
        }
        return res;
    }
}