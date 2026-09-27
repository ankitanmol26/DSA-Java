// public class arraysToSrting {
    
// }
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Puri array se BST banana start kar rahe hain
        // Initially left = 0 aur right = last index
        return makeTree(nums, 0, nums.length - 1);
    }

    public TreeNode makeTree(int[] nums, int left, int right) {

        // Agar left, right se bada ho gaya,
        // iska matlab current range mein koi element nahi hai
        if (left > right) {
            return null;
        }

        // Middle element ko root banayenge
        // Isse tree balanced rahega
        int mid = (left + right) / 2;

        // Middle element se ek new TreeNode create kar rahe hain
        TreeNode root = new TreeNode(nums[mid]);

        // Middle ke left wale elements se left subtree banayenge
        root.left = makeTree(nums, left, mid - 1);

        // Middle ke right wale elements se right subtree banayenge
        root.right = makeTree(nums, mid + 1, right);

        // Bana hua root node return kar rahe hain
        return root;
    }
}
