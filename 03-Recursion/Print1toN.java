public class Print1toN {
    public static void main(String[] args) {
        int n = 5;
        print1ton(n);
    }

    public static void print1ton(int n){
        if(n==0){
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
}
//this program prints numbers in increasing order

// public class PrintNto1{
//     public static void main(String[] args) {
//         int n = 5;

//     }
//     public static void printNto1(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNto1(n-1);
//     }
// }
//this program prints the numbers in reverse 