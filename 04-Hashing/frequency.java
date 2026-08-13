public class frequency{
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,1};
        int[] hash = new int[4];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }
        System.out.println(hash[2]);
    }
}

//TC: for arr and query is O(N)
//SC: it is creating an array size so i think it is O(N) where N is size of arr