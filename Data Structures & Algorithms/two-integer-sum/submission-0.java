class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> input = new HashMap<>();

       for(int i = 0; i< nums.length; i++){
        int difference = target - nums[i];

        if(input.containsKey(difference)){
            return new int[] {input.get(difference), i};
        }

        input.put(nums[i], i);
       } 

       return new int[]{};
    }
}
