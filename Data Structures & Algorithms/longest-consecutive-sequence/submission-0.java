class Solution {
    public int longestConsecutive(int[] nums) {
        //hashset 
        //ordered/sorted array without duplicate elements 

        Set<Integer> output = new HashSet<>();
        int longestLen=0;

        //insert the nums into output 
        for(int i : nums){
            output.add(i);
        }
//calculate the longest consecutive 
        for(int num: output){

  // Start counting only if num - 1 doesn't exist
            if(!output.contains(num-1)){
                int currentNum = num;
                int count = 1; 


                while(output.contains(currentNum+1)){
                      currentNum++;
                      count++;
                }

                 longestLen = Math.max(longestLen, count);
            }
        }

        return longestLen;
    }
}
