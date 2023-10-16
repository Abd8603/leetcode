/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int middle = 1;
        while(start <= end){
            middle = start + (end - start)/2;
            int check = guess(middle);
            if(check == 0) return middle;
            else if(check<0) end = middle - 1;
            else start = middle + 1;
        }
        return middle;
    }
}