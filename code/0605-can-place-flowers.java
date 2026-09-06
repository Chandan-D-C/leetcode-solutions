class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        if(a.length==1 && a[0]==1 && n>0){
            return false;
        }
        if(a.length==1 && a[0]==0 && n==1){
            return true;
        }
        if(a.length==1 && a[0]==1 && n==0){
            return true;
        }
        if(a.length==1 && a[0]==0 && n==0){
            return true;
        }
        if(a.length==1 && n>=0){
            return false;
        }
        int i;
        for(i=0;i<=a.length-1;i++){
            if(i==0 && a[0]==0 && a[1]==0 && n>0){
                a[0]=1;
                n--;
            }
            else if(i==a.length-1 && a[a.length-1]==0 && a[a.length-2]==0 && n>0){
                a[a.length-1]=1;
                n--;
            }

            else if(i+1<=a.length-1 && i-1>=0 && a[i]==0 && a[i-1]==0 && a[i+1]==0 && n>0){
                a[i]=1;
                n--;
            }
        }
        if(n==0){
            return true;

        }
        else{
            return false;
        }
        
    }
}

/*
605. Can Place Flowers
https://leetcode.com/problems/can-place-flowers/

Difficulty : Easy
Topics     : Array, Greedy
Runtime    : 1 ms
Memory     : 47.8 MB

------------------------------------------------------------

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array `flowerbed` containing `0`'s and `1`'s, where `0` means empty and `1` means not empty, and an integer `n`, return `true` if `n` new flowers can be planted in the `flowerbed` without violating the no-adjacent-flowers rule and `false` otherwise.

Example 1:

    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true

Example 2:

    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false

Constraints:

  * `1 <= flowerbed.length <= 2 * 104`
  * `flowerbed[i]` is `0` or `1`.
  * There are no two adjacent flowers in `flowerbed`.
  * `0 <= n <= flowerbed.length`
*/
