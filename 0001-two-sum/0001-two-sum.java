class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int lookingfor = target-nums[i];

            if(map.containsKey(lookingfor)){
                return new int[]{
                    i,
                    map.get(lookingfor)
                };
            }
            map.put(nums[i],i);
        }
        return new int[]{
            -1,-1
        };
    }
}

//  here this is using of hashmap ,, this concept are new for me but i do as soon as posible ,, same logic for using two loop but time complexity are n2 but these happen brutal force techniques 
    

    //  one have also as a brutal force which have time complexity is O(n2)
