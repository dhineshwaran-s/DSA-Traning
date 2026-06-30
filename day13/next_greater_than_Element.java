package day13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=arr[i]){
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
        Collections.reverse(res);
        return res;
    }
}
/*
dry run
example array [4, 5, 2, 25]

Step,|    Current Element, |     Action / Logic,                                                                                                                        |  Stack Status, | NGE Answer
1,   |  25 (Last element), | "Stack empty-ah irukku. So, 25-kku periya aalu evanum illa. Answer -1. Apram 25 ah ulla push pandrom.",                                    |    [25],      |    -1
2,   |   2,                | "Stack mela 25 irukku. 25 > 2. So, 2-kku adutha periya number 25 thaan. Answer 25. Apram 2 ah ulla push pandrom.",                         |  "[25, 2]",  |     25
3,   |  5,                 |"Stack mela 2 irukku. Aana 2 < 5 (Chinna number). So 2-ah pop pandrom. Ippo mela 25 irukku. 25 > 5. So, answer 25. Apram 5 ah push pandrom."|  "[25, 5]",  |   25
4,   |   4 (First element),| " Stack mela 5 irukku. 5 > 4. So, 4-kku adutha periya number 5. Answer 5. Apram 4 ah ulla push pandrom.",                                  |   "[25, 5, 4]"|    5

Final NGE Array (Reverse panni pota step-oda results): [5, 25, 25, -1]

*/