class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n<=0){
            return false;
        }

        for(int i =0;i<=30;i++){
            if(Math.pow(2,i)==n){
                return true;


            }        
     
            }
            return false;
    }
}

/*
231. Power of Two
https://leetcode.com/problems/power-of-two/

Difficulty : Easy
Topics     : Math, Bit Manipulation, Recursion
Runtime    : 1 ms
Memory     : 42.9 MB

------------------------------------------------------------

Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

Example 1:

    Input: n = 1
    Output: true
    Explanation: 20 = 1

Example 2:

    Input: n = 16
    Output: true
    Explanation: 24 = 16

Example 3:

    Input: n = 3
    Output: false

Constraints:

  * `-231 <= n <= 231 - 1`

Follow up: Could you solve it without loops/recursion?
*/
