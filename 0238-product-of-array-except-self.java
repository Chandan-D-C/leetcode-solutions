class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        int prod = 1;

        // Prefix product
        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            pre[i] = prod;
        }

        // Reset product
        prod = 1;

        // Suffix product
        for (int i = nums.length - 1; i >= 0; i--) {
            prod = prod * nums[i];
            suf[i] = prod;
        }

        // First element
        nums[0] = suf[1];

        // Last element
        nums[nums.length - 1] = pre[nums.length - 2];

        // Middle elements
        for (int i = 1; i <= nums.length - 2; i++) {
            nums[i] = pre[i - 1] * suf[i + 1];
        }

        return nums;
    }
}

/*
238. Product of Array Except Self
https://leetcode.com/problems/product-of-array-except-self/

Difficulty : Medium
Topics     : Array, Prefix Sum
Runtime    : 2 ms
Memory     : 63.2 MB

------------------------------------------------------------

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

Example 1:

    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]

Example 2:

    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]

Constraints:

  * `2 <= nums.length <= 105`
  * `-30 <= nums[i] <= 30`
  * The input is generated such that `answer[i]` is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in `O(1)` extra space complexity? (The output array does not count as extra space for space complexity analysis.)

Hints:
  1. Think how you can efficiently utilize prefix and suffix products to calculate the product of all elements except self for each index. Can you pre-compute the prefix and suffix products in linear time to avoid redundant calculations?
  2. Can you minimize additional space usage by reusing memory or modifying the input array to store intermediate results?
*/
