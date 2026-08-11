public class Palindrome {

    public static boolean isPalindrome(int[] arr, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (arr[left] != arr[right]) {
            return false;
        }

        return isPalindrome(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        System.out.println(isPalindrome(arr, 0, arr.length - 1));
    }
}
//first i wrote the base case and then i wrote the mismatch case if left and right
//is not equal then return false and then i wrote the recursive step and main function
//TC : O(N)
//SC : O(N)


//for the leetcode problem to check the palindrome or not which is in string
// class Solution {

//     public boolean isPalindrome(String s) {
//         return checkPalindrome(s, 0, s.length() - 1);
//     }

//     public boolean checkPalindrome(String s, int left, int right) {

        
//         if (left >= right) {
//             return true;
//         }

        
//         if (!Character.isLetterOrDigit(s.charAt(left))) {
//             return checkPalindrome(s, left + 1, right);
//         }

        
//         if (!Character.isLetterOrDigit(s.charAt(right))) {
//             return checkPalindrome(s, left, right - 1);
//         }

        
//         if (Character.toLowerCase(s.charAt(left)) !=
//             Character.toLowerCase(s.charAt(right))) {
//             return false;
//         }

        
//         return checkPalindrome(s, left + 1, right - 1);
//     }
// }

/*


# Palindrome — Recursive Two Pointer Approach

### Idea

Use **two pointers**:

* `left` starts from `0`
* `right` starts from `s.length() - 1`
* Compare characters from both ends.
* Move both pointers toward the center.

### Steps

1. **Base condition**

   ```java
   if (left >= right) return true;
   ```

   When pointers meet/cross, all characters matched → palindrome.

2. **Skip non-alphanumeric characters**

   ```java
   if (!Character.isLetterOrDigit(s.charAt(left)))
       return checkPalindrome(s, left + 1, right);

   if (!Character.isLetterOrDigit(s.charAt(right)))
       return checkPalindrome(s, left, right - 1);
   ```

3. **Compare ignoring case**

   ```java
   if (Character.toLowerCase(s.charAt(left)) !=
       Character.toLowerCase(s.charAt(right)))
       return false;
   ```

4. **Move both pointers**

   ```java
   return checkPalindrome(s, left + 1, right - 1);
   ```

### Code

```java
class Solution {

    public boolean isPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private boolean checkPalindrome(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return checkPalindrome(s, left + 1, right);
        }

        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return checkPalindrome(s, left, right - 1);
        }

        if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        return checkPalindrome(s, left + 1, right - 1);
    }
}
```

### Remember

**Same approach as array palindrome:**

```text
Check → Skip invalid → Compare → Move inward → Repeat
```

The only difference is that for strings we must:

* Ignore non-alphanumeric characters
* Ignore uppercase/lowercase differences

### Complexity

* **Time:** `O(n)`
* **Space:** `O(n)` because of recursive call stack
 */