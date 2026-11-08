class Solution {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;
        int value=0;
        while(i<=j){
            int mid =(i+j)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                i=mid+1;
                
            }else{
                j=mid-1;
            }
            value=i;
           
        }

       return value; 
    }
}

/*
35. Search Insert Position
https://leetcode.com/problems/search-insert-position/

Difficulty : Easy
Topics     : Array, Binary Search
Runtime    : 0 ms
Memory     : 44.1 MB

------------------------------------------------------------

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

Example 1:

    Input: nums = [1,3,5,6], target = 5
    Output: 2

Example 2:

    Input: nums = [1,3,5,6], target = 2
    Output: 1

Example 3:

    Input: nums = [1,3,5,6], target = 7
    Output: 4

Constraints:

  * `1 <= nums.length <= 104`
  * `-104 <= nums[i] <= 104`
  * `nums` contains distinct values sorted in ascending order.
  * `-104 <= target <= 104`
*/
