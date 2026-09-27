class Solution {
    public int subtractProductAndSum(int n) {

        int prod=1;
        int sum=0;

        while(n!=0){
          int d=n%10;
            prod=prod*d;
            sum=sum+d;
            n=n/10;

        }
       
        return prod-sum;
    }
}

/*
1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

Difficulty : Easy
Topics     : Math
Runtime    : 0 ms
Memory     : 42.1 MB

------------------------------------------------------------

Given an integer number `n`, return the difference between the product of its digits and the sum of its digits.

Example 1:

    Input: n = 234
    Output: 15
    Explanation:
    Product of digits = 2 * 3 * 4 = 24
    Sum of digits = 2 + 3 + 4 = 9
    Result = 24 - 9 = 15

Example 2:

    Input: n = 4421
    Output: 21
    Explanation:
    Product of digits = 4 * 4 * 2 * 1 = 32
    Sum of digits = 4 + 4 + 2 + 1 = 11
    Result = 32 - 11 = 21

Constraints:

  * `1 <= n <= 10^5`

Hints:
  1. How to compute all digits of the number ?
  2. Use modulus operator (%) to compute the last digit.
  3. Generalise modulus operator idea to compute all digits.
*/
