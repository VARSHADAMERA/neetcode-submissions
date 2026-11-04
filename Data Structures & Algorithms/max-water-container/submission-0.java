class Solution {
    public int maxArea(int[] heights) {
        //two pointer approach 
        //need to get the max area using the min height and width 

        int i = 0;
        int j = heights.length - 1;
        int area = 0;
        int max_area = 0;

        while(i < j){
        area = Math.min(heights[i], heights[j]) * (j - i);
        max_area = Math.max(area, max_area);

        if(heights[i] <= heights[j]){
            i++;
        }
        else{
            j--;
        }
        }

        return max_area;
    
    }
}
