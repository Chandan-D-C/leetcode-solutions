class Solution {
    public boolean isValid(String s) {

        LinkedList<Character> l = new LinkedList<>();
        for(char x: s.toCharArray()){
            if(x=='(' || x=='{' || x=='['){
                l.addLast(x);

            }
            else if(l.size()!=0 && x==')' && l.peekLast()=='('){
                l.removeLast();
            }
            else if(l.size()!=0 && x=='}' && l.peekLast()=='{'){
                l.removeLast();
            }
            else if(l.size()!=0 && x==']' && l.peekLast()=='['){
                l.removeLast();
            }
            else{
                return false;
            }
            
        }
        if(l.size()!=0){
            return false;
        }
        return true;
    }
}

/*
20. Valid Parentheses
https://leetcode.com/problems/valid-parentheses/

Difficulty : Easy
Topics     : String, Stack, Bracket Sequences
Runtime    : 2 ms
Memory     : 43.4 MB

------------------------------------------------------------

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

  1. Open brackets must be closed by the same type of brackets.
  2. Open brackets must be closed in the correct order.
  3. Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

Constraints:

  * `1 <= s.length <= 104`
  * `s` consists of parentheses only `'()[]{}'`.

Hints:
  1. Use a stack of characters.
  2. When you encounter an opening bracket, push it to the top of the stack.
  3. When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack. Otherwise, return false.
*/
