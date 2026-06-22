class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int pre=0;
        int sum=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre=pre+nums[i];
            int diff=pre-k;
            if(mp.containsKey(diff)){
                sum=sum+mp.get(diff);
            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }
        return sum;