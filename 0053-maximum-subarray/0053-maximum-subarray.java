class Solution {
    public int maxSubArray(int[] nums) {
      int cs=0;
      int ms=Integer.MIN_VALUE;
      int maxItem=nums[0];
      for(int i=0;i<nums.length;i++){
        cs+=nums[i];

        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
        if(ms==0){
            maxItem=Math.max(maxItem,nums[i]);
               ms=maxItem;
        }
     
      }  
      return ms;
    }
    
}