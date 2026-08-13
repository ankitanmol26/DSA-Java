import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 2, 7, 5, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }
}