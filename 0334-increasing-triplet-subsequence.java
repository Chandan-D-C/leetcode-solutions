class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        if(nums.length<3){
            return false;
        }
         pre[0]= nums[0];
         int i;
         for(i=1;i<=nums.length-1;i++){
            pre[i]=Math.min(nums[i],pre[i-1]);
         }
         suf[nums.length-1]=nums[nums.length-1];
         for(i=nums.length-2;i>=0;i--){
            suf[i]=Math.max(nums[i], suf[i+1]);
         }
        for(i=1;i<=nums.length-2;i++){
            if(pre[i-1]<nums[i] && nums[i]<suf[i+1]){
                return true;
            }
        } 
      return false;  
    }
}

/*
334. Increasing Triplet Subsequence
https://leetcode.com/problems/increasing-triplet-subsequence/

Difficulty : Medium
Topics     : Array, Greedy, Longest Increasing Subsequence
Runtime    : 7 ms
Memory     : 126.8 MB

------------------------------------------------------------

Given an integer array `nums`, return `true` if there exists a triple of indices `(i, j, k)` such that `i < j < k` and `nums[i] < nums[j] < nums[k]`. If no such indices exists, return `false`.

Example 1:

    Input: nums = [1,2,3,4,5]
    Output: true
    Explanation: Any triplet where i < j < k is valid.

Example 2:

    Input: nums = [5,4,3,2,1]
    Output: false
    Explanation: No triplet exists.

Example 3:

    Input: nums = [2,1,5,0,4,6]
    Output: true
    Explanation: One of the valid triplet is (1, 4, 5), because nums[1] == 1 < nums[4] == 4 < nums[5] == 6.

Constraints:

  * `1 <= nums.length <= 5 * 105`
  * `-231 <= nums[i] <= 231 - 1`

Follow up: Could you implement a solution that runs in `O(n)` time complexity and `O(1)` space complexity?
*/
