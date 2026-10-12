class Solution {
    public boolean isPowerOfThree(int n) {
        
        // if(n<=0){
        //     return false;
        // }

        // for(int i =0 ; i<=30;i++){
        //     if(Math.pow(3,i)==n){
        //         return true;
        //     }
        // }
        // return false;
        if(n < 1)
        {
            return false;
        }
        if( n%3 == 0)
        {
            return isPowerOfThree(n/3);
        }
        if( n == 1)
       {
         return true;
       }

        return false;
    }
}

/*
326. Power of Three
https://leetcode.com/problems/power-of-three/

Difficulty : Easy
Topics     : Math, Recursion
Runtime    : 8 ms
Memory     : 46.2 MB

------------------------------------------------------------

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of three, if there exists an integer `x` such that `n == 3x`.

Example 1:

    Input: n = 27
    Output: true
    Explanation: 27 = 33

Example 2:

    Input: n = 0
    Output: false
    Explanation: There is no x where 3x = 0.

Example 3:

    Input: n = -1
    Output: false
    Explanation: There is no x where 3x = (-1).

Constraints:

  * `-231 <= n <= 231 - 1`

Follow up: Could you solve it without loops/recursion?
*/
