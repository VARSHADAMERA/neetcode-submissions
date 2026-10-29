class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();

         //count the frequencies 
         for(int i=0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
         }

         //create min-heap based on frequency 
         PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)-> map.get(a) - map.get(b)
         );

         //add the numbers into heap 
         for(int num : map.keySet()){
            pq.offer(num);


            //keep only the K most frequent elements in the pq 
            if(pq.size() > k){
                pq.poll();
            }
         }


         //extract k most frequent numbers
         int[] result = new int[k];

         for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}
