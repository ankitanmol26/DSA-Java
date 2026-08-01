public class palindrome {
    public static void main(String[] args) {
        int n = 122;
        int original = n;
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            reverse = reverse *10 +lastDigit;
            
        }
        if(original == reverse){
            System.out.println("it is a palindrome ");
        }else{
            System.out.println("it is not a palndrome");
        }
    }
}

//leetcode problem
// lass Solution {
//     public boolean isPalindrome(int x) {
//         int original = x;
//         int reverse =  0;
//         while(x>0){
//             int lastDigit = x % 10;
//             x = x / 10;
//             reverse = lastDigit + reverse *10;

//         }
//         if(original == reverse){
//             return true;
//         }else{
//             return false;
//         }
        
//     }
// }