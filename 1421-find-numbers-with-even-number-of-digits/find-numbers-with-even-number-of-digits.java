class Solution {
    public boolean nhed(int nums){
        int dc=0;
        while(nums!=0){
            nums=nums/10;
            dc++;
        }
        return dc %2==0;
    }
    public int findNumbers(int[] nums) {
        int ec=0;
        for(int i=0;i<nums.length;i++){
            if(nhed(nums[i])) ec++;
        }
        return ec;
    }
}