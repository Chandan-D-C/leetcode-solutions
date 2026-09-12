class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> h = new HashMap<>();

        for(Integer i : nums1){
            if(!h.containsKey(i)){
                h.put(i, 1);
            }
        }

        int count = 0;

        for(Integer i : nums2){
            if(h.containsKey(i) && h.get(i) == 1){
                h.put(i, 2);
                count++;
            }
        }

        int[] ans = new int[count];
        int index = 0;

        for(Integer i : h.keySet()){
            if(h.get(i) == 2){
                ans[index++] = i;
            }
        }

        return ans;
    }
}

/*
349. Intersection of Two Arrays
https://leetcode.com/problems/intersection-of-two-arrays/

Difficulty : Easy
Topics     : Array, Hash Table, Two Pointers, Binary Search, Sorting
Runtime    : 3 ms
Memory     : 44.8 MB

------------------------------------------------------------

Given two integer arrays `nums1` and `nums2`, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]

Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Explanation: [4,9] is also accepted.

Constraints:

  * `1 <= nums1.length, nums2.length <= 1000`
  * `0 <= nums1[i], nums2[i] <= 1000`
*/
