package day7;

public class theMaxOfvowels {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i-k))!=-1){
                count--;
            }
            if("aeiou".indexOf(s.charAt(i))!=-1){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}

