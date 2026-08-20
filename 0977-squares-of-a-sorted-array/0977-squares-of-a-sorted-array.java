class Solution {
    public int[] sortedSquares(int[] nums) { 
        int []Arr =new int[nums.length];
        for(int i=0; i<nums.length;i++){
             Arr[i] =nums[i]*nums[i];
        }
        Arrays.sort(Arr);
        return Arr;
        
    }
}