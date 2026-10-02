class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //we create a map for storing elements of nums1
        Map<Integer , Integer> map = new HashMap<>();
        //we go through every element in nums1 and put it in the map with frequency 1
        for(int n : nums1){
            map.put(n,1);
        }
        //we create a list
        List<Integer > ans = new ArrayList<>();
        //we go through every element of nums2
        for(int n: nums2){
            //we check that element in nums1 is there in nums2 and also its frequency should be 1
            if(map.containsKey(n) && map.get(n)==1){
                //then we set its frequency to 0
                map.put(n,0);
                //and we add into ans
                ans.add(n);

            }
        }
        //we create a array size of answer
        int[] res = new int[ans.size()];
        //we itreate 
        for(int i = 0; i<ans.size(); i++){
            //we put ans into the result
            res[i]=ans.get(i);
        }
        return res;
    }
}