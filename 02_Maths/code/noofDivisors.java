// public class noofDivisors {
//     public static void main(String[] args) {
//         int n= 24;
       
//     for(int i=1; i<=n; i++){
//         if(n % i == 0){
//            System.out.println(i);
//         }
//     }
   
// }
// }

public class noofDivisors {
    public static void main(String[] args) {
        int n = 36;

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);

                if(i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}