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

//gfg
/*
Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.
A Palindrome number is a number that stays the same when reversed

Examples:

Input: n = 56
Output: true
Explanation: The digit sum of 56 is 5+6 = 11. Since, 11 is a palindrome number.Thus, answer is true.
Input: n = 98
Output: false
Explanation: The digit sum of 98 is 9+8 = 17. Since 17 is not a palindrome,thus, answer is false.

ANS
class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            sum = sum + lastDigit;
        }
        int orginial = sum;
        int reverse = 0;
        while(sum>0){
            int Digit = sum%10;
            sum = sum/10;
            reverse = reverse * 10 + Digit;
        }
        if(orginial == reverse){
            return true;
        }else{
            return false;
        }
    }
}








*/