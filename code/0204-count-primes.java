class Solution {
    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        boolean[] composite = new boolean[n];

        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {

            if (composite[i] == false) {

                for (int j = i * i; j < n; j += i) {
                    composite[j] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {

            if (composite[i] == false) {
                count++;
            }
        }

        return count;
    }
}

/*
204. Count Primes
https://leetcode.com/problems/count-primes/

Difficulty : Medium
Topics     : Array, Math, Enumeration, Number Theory, Primality Test, Sieve Theory, Prime Number Sieve
Runtime    : 677 ms
Memory     : 79.9 MB

------------------------------------------------------------

Given an integer `n`, return the number of prime numbers that are strictly less than `n`.

Example 1:

    Input: n = 10
    Output: 4
    Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

    Input: n = 0
    Output: 0

Example 3:

    Input: n = 1
    Output: 0

Constraints:

  * `0 <= n <= 5 * 106`

Hints:
  1. Checking all the integers in the range [1, n - 1] is not efficient. Think about a better approach.
  2. Since most of the numbers are not primes, we need a fast approach to exclude the non-prime integers.
  3. Use Sieve of Eratosthenes.
*/
