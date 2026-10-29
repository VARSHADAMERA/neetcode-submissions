class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> input = new HashSet<>();
        int i = 0;
        int j = nums.length;

        while(i<j){
            if(input.contains(nums[i])){
                return true;
            }

            input.add(nums[i]);
            i++;
        }

        return false;
    }
}