import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int prefix=0;
        int sum=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int diff=prefix-k;
            if(mp.containsKey(diff)){
                sum=sum+mp.get(diff);
            }
            mp.put(prefix,mp.getOrDefault(prefix,0)+1);
        }
        return sum;
    }
}