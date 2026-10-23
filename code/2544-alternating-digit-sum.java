class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum=0;

        for(int i = 0;i<s.length();i++){
            int digit=Character.getNumericValue(s.charAt(i));

            if(i%2==0){
                sum+=digit;
            }
            else{
                sum-=digit;
            }
        }
        return sum;
       
    }
}

/*
2544. Alternating Digit Sum
https://leetcode.com/problems/alternating-digit-sum/

Difficulty : Easy
Topics     : Math
Runtime    : 0 ms
Memory     : 40.9 MB

------------------------------------------------------------

You are given a positive integer `n`. Each digit of `n` has a sign according to the following rules:

  * The most significant digit is assigned a positive sign.
  * Each other digit has an opposite sign to its adjacent digits.

Return the sum of all digits with their corresponding sign.

Example 1:

    Input: n = 521
    Output: 4
    Explanation: (+5) + (-2) + (+1) = 4.

Example 2:

    Input: n = 111
    Output: 1
    Explanation: (+1) + (-1) + (+1) = 1.

Example 3:

    Input: n = 886996
    Output: 0
    Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

Constraints:

  * `1 <= n <= 109`

Hints:
  1. The first step is to loop over the digits. We can convert the integer into a string, an array of digits, or just loop over its digits.
  2. Keep a variable sign that initially equals 1 and a variable answer that initially equals 0.
  3. Each time you loop over a digit i, add sign * i to answer, then multiply sign by -1.
*/
