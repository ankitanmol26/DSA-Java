public class Highest{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        int highest = 0;
        int answer = 0;
        for(int i = 0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        
        
    }
}