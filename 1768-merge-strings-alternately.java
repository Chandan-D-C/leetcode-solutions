class Solution {
    public String mergeAlternately(String a, String b) {
        int i = 0;
        int j = 0;
        String c = "";

        int pick = 0;

        while (i < a.length() && j < b.length()) {
            if (pick == 0) {
                c = c + a.charAt(i);
                i++;
                pick = 1;
            } else {
                c = c + b.charAt(j);
                j++;
                pick = 0;
            }
        }

        while (i < a.length()) {
            c = c + a.charAt(i);
            i++;
        }

        while (j < b.length()) {
            c = c + b.charAt(j);
            j++;
        }

        return c;
    }
}

/*
1768. Merge Strings Alternately
https://leetcode.com/problems/merge-strings-alternately/

Difficulty : Easy
Topics     : Two Pointers, String
Runtime    : 4 ms
Memory     : 44.4 MB

------------------------------------------------------------

You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

    
    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r

Example 2:

    
    Input: word1 = "ab", word2 = "pqrs"
    Output: "apbqrs"
    Explanation: Notice that as word2 is longer, "rs" is appended to the end.
    word1:  a   b 
    word2:    p   q   r   s
    merged: a p b q   r   s

Example 3:

    
    Input: word1 = "abcd", word2 = "pq"
    Output: "apbqcd"
    Explanation: Notice that as word1 is longer, "cd" is appended to the end.
    word1:  a   b   c   d
    word2:    p   q 
    merged: a p b q c   d

Constraints:

  * `1 <= word1.length, word2.length <= 100`
  * `word1` and `word2` consist of lowercase English letters.

Hints:
  1. Use two pointers, one pointer for each string. Alternately choose the character from each pointer, and move the pointer upwards.
*/
