class Solution {
    public int[] sortedSquares(int[] nums) { 
        int [] rew = new int [nums.length];
        int i=0,j=nums.length-1;
        int k= nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                rew[k] = nums[i]*nums[i];
                i++;
            }else{
                rew[k] = nums[j]*nums[j];
                j--;
            }
            k--;

        }
        return rew;
        
    }
}