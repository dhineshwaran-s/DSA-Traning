package day13;

import java.util.Stack;

public class reverse_string {
    public static String reverseString(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append(st.pop());
        }
        return str.toString();
    }
} 
    

