public class singleNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,3,4};
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans ^= arr[i];
        }
        System.out.println(ans);
    } 
}