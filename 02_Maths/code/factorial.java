// public class factorial {
//     public static void main(String[] args) {
//         int fact = 1;
//         int n = 7;
//         if(n==0 || n==1){
//             System.out.println(1);
//         }
//         for(int i=2; i<n; i++){
//             fact = fact*i;

//         }
//         System.out.println(fact);
//     }
// }
public class factorial{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println(fact(n));
    }
}