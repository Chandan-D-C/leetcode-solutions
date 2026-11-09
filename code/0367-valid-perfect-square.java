class Solution {
    public boolean isPerfectSquare(int num) {

        for(int i=1;i<=num/i;i++){
            if(num == i*i){
                return true;
            }
           
        }
        
        return false;

        // long i=0;
        // long j=num;
        // while(i<=j){
        //     long mid=(i+j)/2;
        //     long square=mid*mid;

        //     if(square==num){
        //         return true;
        //     }else if(square<num){
        //         i=mid+1;
        //     }else{
        //         j=mid-1;
        //     }
        // }
        // return false;
    }
}

/*
367. Valid Perfect Square
https://leetcode.com/problems/valid-perfect-square/

Difficulty : Easy
Topics     : Math, Binary Search
Runtime    : 2 ms
Memory     : 41.8 MB

------------------------------------------------------------

Given a positive integer num, return `true` if `num` is a perfect square or `false` otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as `sqrt`.

Example 1:

    Input: num = 16
    Output: true
    Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:

    Input: num = 14
    Output: false
    Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

Constraints:

  * `1 <= num <= 231 - 1`
*/
