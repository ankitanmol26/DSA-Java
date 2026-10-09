class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //count the frequency of every element in the nums1
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //store common elements in a temporary array
        int[] result = new int[Math.min(nums1.length , nums2.length)];
        //a variable points to the first index
        int k =0;
        //traverse nums2 and match
        for(int num : nums2){
            if(map.getOrDefault(num,0)>0){
                result[k]= num; 
                k++;
                //make it occurence less
                map.put(num,map.get(num)-1);
            }
            
        }
       //return the matched element in the array
            return Arrays.copyOf(result , k);
    }
}
// Complexity
// Time: 
// O(n+m)
// O(n+m) on average, where n
// n and m
// m are the array lengths.

// Space: 
// O(n+m)
// O(n+m) including the map and result array.