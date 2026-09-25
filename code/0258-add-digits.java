class Solution {
    public int addDigits(int num) {

        while(num>=10){

        int sum=0;

			while(num!=0) {
				int n = num %10; 
				sum = sum + n ;
				num=num/10;
	
			}
            num=sum;
        }
			
return num;
    }
}

/*
258. Add Digits
https://leetcode.com/problems/add-digits/

Difficulty : Easy
Topics     : Math, Simulation, Number Theory
Runtime    : 1 ms
Memory     : 42.9 MB

------------------------------------------------------------

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

    Input: num = 38
    Output: 2
    Explanation: The process is
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2
    Since 2 has only one digit, return it.

Example 2:

    Input: num = 0
    Output: 0

Constraints:

  * `0 <= num <= 231 - 1`

Follow up: Could you do it without any loop/recursion in `O(1)` runtime?

Hints:
  1. A naive implementation of the above process is trivial. Could you come up with other methods?
  2. What are all the possible results?
  3. How do they occur, periodically or randomly?
  4. You may find this [Wikipedia article](<https://en.wikipedia.org/wiki/Digital_root>) useful.
*/
