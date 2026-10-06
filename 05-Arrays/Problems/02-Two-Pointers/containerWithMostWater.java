class Solution {
    public int maxArea(int[] height) {
        //left points to first line
        int left = 0;
        //right points to the last line
        int right = height.length-1;
        //we put a variable to calculate the maximum area
        int maxArea = 0;
        while (left<right){
            //for calculating width we minus left from right
            int width = right - left;
            //we calculate the minimum height of the line 
            int shortHeight = Math.min(height[left],height[right]);
            //we calculate the area which is width multiply by short height line
            int area = width * shortHeight;
            //then we calculate the maximum area
             maxArea = Math.max(maxArea, area);
             //if the left line is small then we increment it
            if(height[left]<height[right]){
                left++;
                //else we decrement it
            }else{
                right--;
            }
            
        }
        //we return the maximum area
        return maxArea;
    }
}