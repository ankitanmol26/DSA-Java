import java.util.HashMap;

public class Lowest {
    public static void main(String[] args) {

        int arr[] = {4, 4, 2, 2, 2, 7, 7, 9};

        HashMap<Integer, Integer> map = new HashMap<>();

        int lowest = Integer.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) < lowest) {
                lowest = map.get(arr[i]);
                answer = arr[i];
            }
        }

        System.out.println(answer);
    }
}