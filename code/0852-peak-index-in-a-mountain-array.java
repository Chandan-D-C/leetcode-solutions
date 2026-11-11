class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
       
        while(i<j){
            int mid =(i+j)/2;
            if(arr[mid]<arr[mid+1]){
                i=mid+1;
            }else{  
                j=mid; 
            }
        }
        return i;
    }
}

/*
852. Peak Index in a Mountain Array
https://leetcode.com/problems/peak-index-in-a-mountain-array/

Difficulty : Medium
Topics     : Array, Binary Search, Ternary Search
Runtime    : 0 ms
Memory     : 79.1 MB

------------------------------------------------------------

You are given an integer mountain array `arr` of length `n` where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in `O(log(n))` time complexity.

Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1

Constraints:

  * `3 <= arr.length <= 105`
  * `0 <= arr[i] <= 106`
  * `arr` is guaranteed to be a mountain array.
*/
