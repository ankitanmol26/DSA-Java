import java.util.HashMap;

public class count{
    public static void main(String[] args) {
        int[] arr={10, 5, 10, 15, 10, 5};
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
    