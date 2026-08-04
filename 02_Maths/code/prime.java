// public class prime {
//     public static void main(String[] args) {
//         int n = 8;
//         int count = 0;
//         for (int i =1; i<=n; i++){
//             if( n % i == 0){
//                 count++;
//             }
//         }
//         if(count == 2) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }


//     }
// }

public class prime {
    public static void main(String[] args) {
        int n = 7;
        if(n <= 1){
            System.out.println("Not Prime");
            return;
        }   
        
        for (int i =2; i*i<=n; i++){
            if( n % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
