class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        for (char i : s.toCharArray()) {
            if (h1.containsKey(i)) {
                int x = h1.get(i);
                h1.put(i, x + 1);
            } else {
                h1.put(i, 1);
            }
        }

        for (char i : t.toCharArray()) {
            if (h2.containsKey(i)) {
                int x = h2.get(i);
                h2.put(i, x + 1);
            } else {
                h2.put(i, 1);
            }
        }

        if (h1.size() != h2.size()) {
            return false;
        }

        for (char i : h1.keySet()) {
            if (!h2.containsKey(i)) {
                return false;
            }

            if (!h1.get(i).equals(h2.get(i))) {
                return false;
            }
        }

        return true;
    }
}

/*
242. Valid Anagram
https://leetcode.com/problems/valid-anagram/

Difficulty : Easy
Topics     : Hash Table, String, Sorting
Runtime    : 16 ms
Memory     : 46.7 MB

------------------------------------------------------------

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

Constraints:

  * `1 <= s.length, t.length <= 5 * 104`
  * `s` and `t` consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/
