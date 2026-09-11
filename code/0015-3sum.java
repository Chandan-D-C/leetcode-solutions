class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> h=new HashSet<>();
        Arrays.sort(nums);
        int i;
        for(i=0;i<=nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                        ArrayList<Integer> t=new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        h.add(t);
                        j++;
                        k--;
                    }
                    else if(nums[i]+nums[j]+nums[k]>0){
                        k--;
                }
                else{
                    j++;
            }
        }
    
        
    }
    return new ArrayList<>(h);
}
}

/*
15. 3Sum
https://leetcode.com/problems/3sum/

Difficulty : Medium
Topics     : Array, Two Pointers, Sorting
Runtime    : 319 ms
Memory     : 60.8 MB

------------------------------------------------------------

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.

Example 2:

    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.

Example 3:

    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.

Constraints:

  * `3 <= nums.length <= 3000`
  * `-105 <= nums[i] <= 105`

Hints:
  1. So, we essentially need to find three numbers x, y, and z such that they add up to the given value. If we fix one of the numbers say x, we are left with the two-sum problem at hand!
  2. For the two-sum problem, if we fix one of the numbers, say x, we have to scan the entire array to find the next number y, which is value - x where value is the input parameter. Can we change our array somehow so that this search becomes faster?
  3. The second train of thought for two-sum is, without changing the array, can we use additional space somehow? Like maybe a hash map to speed up the search?
*/
