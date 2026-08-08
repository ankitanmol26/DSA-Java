// public class gcd {
//     public static void main(String[] args) {
//         int a= 24;
//         int b=36;
//         int gcd = 0;
//         // int n;
//         // if(a>b){
//         //     n = a;
//         // }else{
//         //     n = b;
//         // }
//         int min= Math.min(a,b);
//         for(int i = 1; i<=min; i++){
//             if(a%i ==0 && b%i ==0){
//                 gcd = i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }
//TC is O(min(a,b))

public class gcd{
    public static void main(String[] args){
        int a = 30;
        int b = 18;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}


// algo:
// first take two integers and then run a while loop till b becomes 0 and inside it i took an temp variable to store the small value b at first and then i performed an modulo operation on b for a %b then the remainder is stored in the b and then here b is small and then i will store temp to a and here a is big and b is small and then the process is repeated until b becomes 0 after the b is 0 and the a have the greatest common divisor
// SC : we have fixed varaibles and it is storing in it and it is not creating extra so the SC is O(1)
// TC: here we are performing division operation so it is O(logn)
